package day4

import kotlin.properties.Delegates

var winningNumber by Delegates.notNull<Int>()
lateinit var winningCard: BingoCard

fun main() {
    val data = InputData.data

    // prep data
    val draws = data[0].split(",").map { it.toInt() }
    val cards: MutableList<BingoCard> = buildCardList(data)

    playGame(draws, cards)
}

fun buildCardList(data: List<String>): MutableList<BingoCard> {
    val cards = mutableListOf<BingoCard>()

    for (i in 2 until data.size step 6) {
        // SKIP LINE 1 OF BLOCK
        // read i -> i+4 into a card, starting at i=2
        // step 6 to the next set of indexes
        val rows = listOf(
            data[i].split(" ").filterNot { it == "" },
            data[i+1].split(" ").filterNot { it == "" },
            data[i+2].split(" ").filterNot { it == "" },
            data[i+3].split(" ").filterNot { it == "" },
            data[i+4].split(" ").filterNot { it == "" }
        )

        // save card to list
        cards.add(BingoCard(rows))
    }

    return cards
}

fun playGame(draws: List<Int>, cards: List<BingoCard>) {
    val winningCards = mutableListOf<Pair<BingoCard, Int>>()

    // given each number drawn
    outerLoop@ for (number in draws) {
        // and a bingo card
        innerLoop@ for (card in cards) {
            if (card.winner) {
                continue@innerLoop
            } else {
                card.markIfFound(number)

                if(card.hasAWinner()) {
                    card.winner = true
                    winningCards.add(card to number)
                }
            }
        }
    }

    val lastCard = winningCards[winningCards.size-1]
    println(lastCard.first.sumUnmarked() * lastCard.second)
}

class BingoCard(rows: List<List<String>>) {
    var winner = false
    private var cellRows: List<List<BingoCardCell>> = buildCellRows(rows)

    private fun buildCellRows(rows: List<List<String>>): List<List<BingoCardCell>> {
        val cellRows = mutableListOf<List<BingoCardCell>>()

        for (row in rows) {
            val cellRow = mutableListOf<BingoCardCell>()

            for (cell in row) {
                cellRow.add(BingoCardCell(cell.toInt()))
            }

            cellRows.add(cellRow)
        }

        return cellRows
    }

    fun markIfFound(drawing: Int) {
        for (row in cellRows) {
            for (cell in row) {
                if (cell.number == drawing) {
                    cell.marked = true
                }
            }
        }
    }

    fun hasAWinner(): Boolean {
        if (hasAWinningRow() || hasAWinningColumn()) {
            return true
        }

        return false
    }

    private fun hasAWinningRow(): Boolean {
        for (row in cellRows) {
            if (rowIsAllMarked(row)) {
                return true
            }
        }

        return false
    }

    private fun rowIsAllMarked(row: List<BingoCardCell>): Boolean {
        if(row.all { it.marked }) {
            return true
        }

        return false
    }

    private fun hasAWinningColumn(): Boolean {

        outerLoop@ for (i in 0 until cellRows[0].size) {
            innerLoop@ for (row in cellRows) {
                if(!row[i].marked) {
                    continue@outerLoop
                }
            }
            return true
        }
        return false
    }

    fun sumUnmarked(): Int {
        var sum = 0
        for (row in cellRows) {
            for (cell in row) {
                if (!cell.marked) {
                    sum += cell.number
                }
            }
        }

        return sum
    }
}

class BingoCardCell(val number: Int) {
    var marked = false

    override fun toString(): String {
        return "$number, marked: $marked"
    }
}