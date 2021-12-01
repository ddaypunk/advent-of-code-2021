package day1

class InputData {
    companion object {
        val data = """137
138
139
140
143
146
147
149
155
156
159
153
163
169
175
180
183
184
206
219
226
233
231
232
234
231
234
231
234
232
230
235
225
237
245
254
263
275
288
290
291
292
316
334
343
346
359
354
352
374
377
378
391
409
419
427
433
437
411
416
435
442
438
440
443
459
460
466
467
468
467
470
488
493
504
505
506
517
523
526
525
532
541
558
559
561
563
565
582
589
595
586
571
603
607
621
634
642
646
648
651
685
702
707
729
738
741
736
737
761
763
765
769
772
774
779
795
809
835
841
836
845
848
849
874
878
880
881
889
890
915
932
936
945
946
966
965
968
980
987
989
993
994
996
997
1027
1028
1049
1047
1048
1047
1062
1057
1066
1071
1084
1093
1095
1098
1100
1104
1105
1117
1160
1165
1166
1184
1180
1181
1182
1202
1206
1204
1217
1227
1228
1248
1249
1258
1262
1267
1288
1285
1280
1286
1288
1303
1307
1308
1309
1338
1346
1357
1367
1368
1373
1386
1387
1389
1380
1407
1405
1419
1440
1465
1480
1485
1489
1490
1492
1497
1498
1497
1499
1500
1493
1503
1523
1530
1536
1544
1553
1569
1573
1574
1605
1613
1620
1628
1629
1632
1625
1626
1631
1630
1632
1633
1639
1655
1654
1670
1668
1673
1675
1676
1671
1673
1675
1677
1671
1669
1692
1695
1698
1701
1712
1711
1712
1715
1732
1728
1726
1742
1743
1744
1746
1739
1744
1757
1758
1760
1769
1772
1773
1782
1789
1794
1799
1828
1852
1856
1859
1866
1867
1868
1876
1877
1869
1874
1873
1901
1910
1912
1913
1919
1939
1940
1941
1948
1977
1976
1978
2011
2012
2015
2025
2035
2046
2040
2041
2062
2063
2064
2086
2104
2112
2111
2120
2121
2130
2139
2141
2154
2155
2157
2158
2185
2181
2183
2188
2189
2192
2197
2191
2200
2192
2220
2223
2231
2237
2246
2254
2245
2257
2258
2263
2268
2269
2281
2280
2284
2291
2328
2331
2313
2319
2321
2324
2327
2328
2346
2347
2346
2347
2348
2350
2353
2344
2335
2337
2339
2338
2342
2347
2350
2351
2356
2378
2379
2387
2386
2385
2384
2393
2407
2408
2409
2412
2413
2409
2422
2430
2431
2432
2457
2458
2459
2468
2472
2473
2480
2511
2493
2506
2514
2522
2524
2525
2530
2540
2527
2536
2546
2548
2552
2547
2552
2551
2569
2573
2590
2607
2626
2624
2641
2642
2643
2645
2666
2691
2702
2719
2734
2735
2743
2750
2769
2796
2797
2800
2804
2806
2820
2821
2822
2826
2834
2835
2836
2840
2841
2842
2838
2826
2827
2844
2843
2844
2857
2875
2877
2878
2908
2912
2913
2916
2921
2920
2923
2924
2925
2942
2943
2972
2984
2987
2999
3020
3014
3018
3017
3015
3016
3018
3021
2997
3000
2989
2981
2988
2989
2988
2989
2990
2993
2998
2999
3000
3007
3012
3013
3023
3022
3028
3063
3079
3085
3086
3085
3087
3097
3102
3103
3110
3114
3120
3136
3141
3163
3164
3166
3168
3179
3174
3175
3180
3196
3210
3188
3202
3204
3201
3207
3208
3217
3225
3231
3230
3231
3230
3274
3292
3296
3321
3351
3365
3367
3378
3381
3379
3380
3385
3383
3384
3393
3403
3404
3411
3426
3420
3422
3423
3440
3449
3460
3459
3460
3463
3464
3468
3492
3506
3513
3520
3525
3526
3529
3535
3553
3555
3556
3548
3563
3565
3568
3571
3572
3578
3583
3585
3586
3590
3602
3604
3610
3611
3612
3640
3649
3668
3658
3650
3652
3654
3657
3639
3640
3651
3639
3653
3655
3662
3683
3684
3686
3692
3693
3707
3717
3722
3735
3737
3743
3756
3753
3754
3756
3759
3760
3764
3766
3796
3800
3809
3817
3818
3819
3820
3799
3798
3801
3810
3811
3818
3819
3826
3833
3840
3842
3853
3851
3835
3836
3841
3846
3847
3852
3861
3864
3861
3869
3871
3872
3887
3889
3913
3928
3929
3937
3961
3966
3975
3998
3999
3994
3989
3965
3955
3959
3983
3994
3995
3996
3997
4000
4005
4004
4005
4012
4027
4007
4008
4011
4023
4037
4040
4062
4063
4066
4073
4078
4106
4113
4114
4126
4131
4126
4129
4164
4165
4176
4162
4172
4196
4200
4198
4199
4196
4205
4208
4220
4255
4252
4249
4259
4275
4281
4283
4286
4295
4296
4273
4271
4290
4291
4296
4302
4303
4315
4316
4317
4329
4330
4335
4336
4340
4341
4342
4314
4307
4309
4308
4313
4322
4319
4321
4318
4319
4322
4317
4318
4320
4324
4347
4355
4358
4363
4364
4375
4379
4378
4390
4399
4390
4395
4408
4425
4419
4430
4431
4437
4460
4470
4472
4473
4502
4494
4495
4509
4514
4513
4523
4527
4544
4573
4583
4584
4552
4586
4587
4598
4601
4607
4613
4607
4617
4649
4647
4642
4649
4659
4661
4651
4652
4673
4679
4684
4685
4686
4687
4689
4690
4696
4702
4710
4683
4694
4695
4696
4697
4698
4700
4698
4699
4701
4686
4688
4712
4713
4711
4729
4739
4742
4762
4763
4767
4773
4781
4785
4775
4776
4779
4777
4779
4780
4787
4773
4784
4789
4793
4809
4828
4830
4824
4827
4829
4830
4834
4842
4843
4844
4847
4848
4849
4866
4867
4868
4879
4880
4883
4897
4900
4904
4910
4922
4931
4932
4934
4935
4934
4936
4946
4947
4974
4978
4983
4984
4985
4992
4998
5007
5052
5059
5067
5072
5088
5087
5093
5114
5115
5118
5117
5118
5121
5127
5128
5132
5134
5135
5157
5151
5156
5160
5155
5151
5140
5141
5163
5158
5163
5166
5172
5176
5179
5180
5171
5174
5188
5190
5212
5213
5214
5215
5229
5234
5237
5244
5249
5250
5251
5255
5256
5258
5270
5272
5276
5292
5293
5303
5317
5325
5308
5310
5318
5324
5346
5356
5373
5370
5384
5385
5383
5387
5391
5398
5399
5413
5415
5416
5444
5443
5450
5444
5446
5447
5448
5465
5470
5455
5461
5441
5443
5452
5457
5460
5465
5466
5470
5473
5510
5515
5516
5517
5521
5519
5510
5524
5526
5531
5555
5529
5541
5543
5545
5549
5559
5572
5574
5601
5622
5631
5633
5659
5661
5669
5698
5701
5685
5682
5708
5707
5694
5695
5698
5699
5700
5711
5712
5720
5721
5723
5730
5723
5721
5729
5738
5739
5740
5741
5744
5747
5748
5750
5751
5761
5756
5761
5764
5768
5786
5798
5799
5808
5829
5840
5842
5834
5842
5843
5861
5863
5882
5898
5904
5909
5927
5931
5925
5927
5920
5921
5946
5954
5971
6002
6005
6001
6015
6018
6020
6030
6031
6032
6034
6035
6050
6051
6055
6059
6020
6014
6015
6011
5990
5991
5969
5970
5950
5951
5961
5962
5964
5970
5972
5977
5987
5989
5998
6001
6006
6009
6012
6017
6023
6028
6029
6030
6051
6053
6055
6056
6058
6082
6090
6094
6106
6108
6111
6128
6131
6150
6157
6158
6183
6180
6182
6191
6153
6152
6178
6174
6164
6167
6175
6187
6186
6187
6199
6204
6205
6210
6213
6214
6217
6228
6206
6212
6211
6210
6216
6221
6224
6226
6243
6245
6237
6238
6246
6247
6250
6256
6269
6260
6261
6266
6268
6271
6281
6279
6268
6229
6231
6233
6235
6241
6248
6250
6261
6263
6276
6286
6288
6291
6274
6273
6276
6285
6292
6297
6330
6331
6295
6311
6312
6325
6319
6321
6322
6325
6327
6340
6341
6350
6356
6357
6365
6370
6383
6382
6396
6394
6395
6403
6404
6399
6400
6409
6411
6414
6421
6424
6429
6430
6440
6441
6450
6455
6464
6481
6495
6474
6475
6476
6478
6482
6506
6524
6497
6490
6492
6508
6507
6511
6518
6519
6528
6554
6555
6562
6563
6571
6574
6564
6581
6582
6584
6585
6586
6587
6590
6617
6623
6653
6652
6636
6638
6640
6660
6663
6668
6673
6675
6679
6680
6683
6699
6698
6694
6701
6715
6697
6700
6706
6715
6702
6705
6707
6719
6720
6721
6722
6723
6727
6724
6725
6726
6732
6739
6741
6760
6771
6773
6772
6775
6783
6785
6791
6800
6808
6809
6810
6811
6793
6797
6799
6801
6805
6806
6833
6839
6840
6845
6846
6856
6869
6861
6878
6881
6903
6914
6915
6931
6934
6936
6938
6940
6954
6952
6953
6961
6951
6953
6961
6963
6968
6976
6977
6980
6986
6995
6996
7006
7011
6991
6992
6996
7002
7025
7029
7041
7040
7041
7033
7036
7038
7042
7044
7058
7064
7071
7076
7078
7079
7091
7090
7086
7088
7105
7140
7143
7132
7146
7137
7139
7141
7142
7151
7153
7154
7160
7162
7164
7167
7171
7183
7205
7218
7220
7252
7264
7270
7274
7275
7285
7286
7289
7311
7299
7301
7325
7331
7341
7343
7348
7380
7388
7390
7392
7400
7412
7414
7419
7448
7430
7436
7450
7451
7484
7493
7503
7494
7495
7521
7507
7514
7517
7519
7532
7558
7574
7575
7593
7595
7620
7636
7643
7644
7634
7637
7639
7650
7651
7652
7666
7673
7690
7693
7702
7703
7735
7736
7727
7743
7745
7763
7764
7734
7735
7739
7743
7744
7750
7751
7754
7759
7765
7770
7804
7808
7790
7791
7793
7794
7795
7796
7798
7808
7775
7776
7777
7799
7800
7803
7817
7818
7834
7832
7834
7843
7849
7850
7853
7856
7859
7861
7862
7864
7860
7859
7861
7862
7863
7862
7867
7853
7854
7860
7855
7859
7860
7865
7845
7855
7858
7881
7882
7899
7902
7930
7931
7932
7933
7935
7938
7941
7953
7954
7952
7965
7967
7976
7977
7980
7982
7991
8001
8017
8018
8036
8037
8047
8049
8051
8041
8043
8044
8045
8046
8047
8048
8054
8055
8082
8083
8084
8093
8094
8116
8117
8118
8124
8125
8142
8145
8150
8154
8156
8175
8176
8184
8190
8184
8200
8214
8236
8237
8253
8264
8271
8280
8282
8284
8296
8297
8299
8304
8329
8341
8345
8358
8359
8366
8370
8368
8374
8377
8378
8379
8390
8391
8394
8399
8405
8406
8405
8404
8397
8400
8406
8426
8427
8451
8457
8458
8459
8470
8448
8450
8452
8474
8494
8495
8500
8499
8496
8500
8501
8502
8503
8530
8541
8545
8547
8566
8593
8596
8597
8596
8609
8612
8627
8631
8623
8624
8626
8641
8642
8644
8646
8651
8654
8657
8666
8673
8674
8687
8707
8715
8722
8711
8712
8715
8712
8719
8722
8719
8720
8722
8723
8727
8729
8731
8732
8733
8737
8743
8741
8742
8747
8749
8753
8766
8771
8776
8784
8789
8806
8816
8840
8847
8858
8859
8860
8862
8863
8866
8867
8873
8884
8882
8884
8890
8858
8861
8862
8860
8861
8879
8900
8928
8940
8942
8940
8961
8962
8969
8988
8993
8998
9006
9011
9013
9037
9050
9060
9067
9068
9090
9108
9113
9116
9137
9138
9115
9116
9119
9125
9126
9124
9151
9161
9170
9173
9182
9187
9202
9203
9221
9223
9222
9223
9234
9235
9249
9268
9260
9284
9302
9305
9324
9325
9326
9320
9315
9317
9319
9320
9336
9347
9354
9371
9376
9386
9387
9397
9396
9397
9399
9404
9405
9407
9423
9424
9432
9434
9435
9436
9438
9448
9456
9457
9458
9457
9448
9449
9453
9454
9460
9469
9458
9459
9469
9477
9481
9482
9488
9496
9497
9498
9500
9501
9518
9520
9523
9539
9537
9548
9555
9568
9576
9579
9589
9591
9590
9594
9595
9596
9598
9605
9602
9604
9600
9613
9610
9616
9638
9639
9640
9648
9653
9667
9679
9680
9681
9677
9679
9680
9681
9706
9707
9709
9710
9714
9719
9736
9739
9762
9753
9770
9739
9752
9753
9752
9753
9762
9764
9765
9766
9769
9774
9773
9782
9792
9793
9798
9809
9810
9809
9806
9807
9806
9808
9810
9813
9818
9816
9832
9833
9831
9851
9839
9847
9849
9850
9851
9853
9854
9858
9862
9865
9872
9875
9881
9883
9884
9885
9898
9903
9904
9899
9906
9907
9909
9939
9955
9956
9957
9963
9964
9965
9969
9972
9980
10002
10003
10004
10007
10008
10015
10032
10047
10060
10066
10071
10078
10079
10083
10095
10096
10097
10090
10091
10088
10085
10095
10096
10099
10089
10108
10109
10110
10107
10112
10119
10135
10133
10121
10130
10125
10127
10128
10131
10121
10134
10137
10139
10179
10180
10182
10194""".lines()
    }
}