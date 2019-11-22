### Testing different kinds of GC under memory leak

## G1

<details>
<summary>Trace:</summary>

```
[0.014s][info][gc,heap] Heap region size: 1M
[0.018s][info][gc     ] Using G1
[0.018s][info][gc,heap,coops] Heap address: 0x00000000f8000000, size: 128 MB, Compressed Oops mode: 32-bit
[0.039s][info][gc           ] Periodic GC disabled
[2.735s][info][gc,start     ] GC(0) Pause Young (Normal) (G1 Evacuation Pause)
[2.735s][info][gc,task      ] GC(0) Using 3 workers of 8 for evacuation
[2.750s][info][gc,phases    ] GC(0)   Pre Evacuate Collection Set: 0.0ms
[2.750s][info][gc,phases    ] GC(0)   Evacuate Collection Set: 14.0ms
[2.750s][info][gc,phases    ] GC(0)   Post Evacuate Collection Set: 0.5ms
[2.750s][info][gc,phases    ] GC(0)   Other: 0.5ms
[2.750s][info][gc,heap      ] GC(0) Eden regions: 24->0(13)
[2.750s][info][gc,heap      ] GC(0) Survivor regions: 0->3(3)
[2.755s][info][gc,heap      ] GC(0) Old regions: 0->12
[2.755s][info][gc,heap      ] GC(0) Archive regions: 0->0
[2.755s][info][gc,heap      ] GC(0) Humongous regions: 2->2
[2.755s][info][gc,metaspace ] GC(0) Metaspace: 1661K->1661K(1056768K)
[2.755s][info][gc           ] GC(0) Pause Young (Normal) (G1 Evacuation Pause) 26M->16M(128M) 20.302ms
[2.755s][info][gc,cpu       ] GC(0) User=0.03s Sys=0.02s Real=0.02s
[2.770s][info][gc,start     ] GC(1) Pause Young (Normal) (G1 Evacuation Pause)
[2.770s][info][gc,task      ] GC(1) Using 3 workers of 8 for evacuation
[2.782s][info][gc,phases    ] GC(1)   Pre Evacuate Collection Set: 0.0ms
[2.783s][info][gc,phases    ] GC(1)   Evacuate Collection Set: 12.1ms
[2.783s][info][gc,phases    ] GC(1)   Post Evacuate Collection Set: 0.5ms
[2.783s][info][gc,phases    ] GC(1)   Other: 0.1ms
[2.783s][info][gc,heap      ] GC(1) Eden regions: 13->0(23)
[2.783s][info][gc,heap      ] GC(1) Survivor regions: 3->2(2)
[2.783s][info][gc,heap      ] GC(1) Old regions: 12->27
[2.783s][info][gc,heap      ] GC(1) Archive regions: 0->0
[2.783s][info][gc,heap      ] GC(1) Humongous regions: 4->4
[2.783s][info][gc,metaspace ] GC(1) Metaspace: 2042K->2042K(1056768K)
[2.783s][info][gc           ] GC(1) Pause Young (Normal) (G1 Evacuation Pause) 31M->32M(128M) 12.917ms
[2.783s][info][gc,cpu       ] GC(1) User=0.05s Sys=0.00s Real=0.01s
[6.170s][info][gc,start     ] GC(2) Pause Young (Normal) (G1 Evacuation Pause)
[6.170s][info][gc,task      ] GC(2) Using 3 workers of 8 for evacuation
[6.189s][info][gc,phases    ] GC(2)   Pre Evacuate Collection Set: 0.0ms
[6.189s][info][gc,phases    ] GC(2)   Evacuate Collection Set: 17.7ms
[6.189s][info][gc,phases    ] GC(2)   Post Evacuate Collection Set: 0.5ms
[6.189s][info][gc,phases    ] GC(2)   Other: 0.2ms
[6.189s][info][gc,heap      ] GC(2) Eden regions: 23->0(18)
[6.189s][info][gc,heap      ] GC(2) Survivor regions: 2->4(4)
[6.189s][info][gc,heap      ] GC(2) Old regions: 27->47
[6.189s][info][gc,heap      ] GC(2) Archive regions: 0->0
[6.189s][info][gc,heap      ] GC(2) Humongous regions: 7->7
[6.189s][info][gc,metaspace ] GC(2) Metaspace: 2426K->2426K(1056768K)
[6.189s][info][gc           ] GC(2) Pause Young (Normal) (G1 Evacuation Pause) 58M->57M(128M) 18.587ms
[6.189s][info][gc,cpu       ] GC(2) User=0.02s Sys=0.03s Real=0.02s
[20.060s][info][gc,start     ] GC(3) Pause Young (Normal) (G1 Evacuation Pause)
[20.060s][info][gc,task      ] GC(3) Using 3 workers of 8 for evacuation
[20.073s][info][gc,phases    ] GC(3)   Pre Evacuate Collection Set: 0.0ms
[20.073s][info][gc,phases    ] GC(3)   Evacuate Collection Set: 13.1ms
[20.073s][info][gc,phases    ] GC(3)   Post Evacuate Collection Set: 0.6ms
[20.073s][info][gc,phases    ] GC(3)   Other: 0.2ms
[20.073s][info][gc,heap      ] GC(3) Eden regions: 15->0(13)
[20.073s][info][gc,heap      ] GC(3) Survivor regions: 4->3(3)
[20.073s][info][gc,heap      ] GC(3) Old regions: 47->59
[20.074s][info][gc,heap      ] GC(3) Archive regions: 0->0
[20.074s][info][gc,heap      ] GC(3) Humongous regions: 11->11
[20.074s][info][gc,metaspace ] GC(3) Metaspace: 2434K->2434K(1056768K)
[20.074s][info][gc           ] GC(3) Pause Young (Normal) (G1 Evacuation Pause) 76M->72M(128M) 13.992ms
[20.074s][info][gc,cpu       ] GC(3) User=0.03s Sys=0.02s Real=0.01s
[20.083s][info][gc,start     ] GC(4) Pause Young (Concurrent Start) (G1 Evacuation Pause)
[20.083s][info][gc,task      ] GC(4) Using 3 workers of 8 for evacuation
[20.094s][info][gc,phases    ] GC(4)   Pre Evacuate Collection Set: 0.0ms
[20.094s][info][gc,phases    ] GC(4)   Evacuate Collection Set: 10.6ms
[20.094s][info][gc,phases    ] GC(4)   Post Evacuate Collection Set: 0.2ms
[20.094s][info][gc,phases    ] GC(4)   Other: 0.2ms
[20.094s][info][gc,heap      ] GC(4) Eden regions: 13->0(9)
[20.094s][info][gc,heap      ] GC(4) Survivor regions: 3->2(2)
[20.094s][info][gc,heap      ] GC(4) Old regions: 59->73
[20.094s][info][gc,heap      ] GC(4) Archive regions: 0->0
[20.094s][info][gc,heap      ] GC(4) Humongous regions: 11->11
[20.094s][info][gc,metaspace ] GC(4) Metaspace: 2439K->2439K(1056768K)
[20.094s][info][gc           ] GC(4) Pause Young (Concurrent Start) (G1 Evacuation Pause) 85M->86M(128M) 11.369ms
[20.094s][info][gc,cpu       ] GC(4) User=0.03s Sys=0.02s Real=0.01s
[20.095s][info][gc           ] GC(5) Concurrent Cycle
[20.095s][info][gc,marking   ] GC(5) Concurrent Clear Claimed Marks
[20.095s][info][gc,marking   ] GC(5) Concurrent Clear Claimed Marks 0.022ms
[20.095s][info][gc,marking   ] GC(5) Concurrent Scan Root Regions
[20.098s][info][gc,marking   ] GC(5) Concurrent Scan Root Regions 3.109ms
[20.098s][info][gc,marking   ] GC(5) Concurrent Mark (20.098s)
[20.098s][info][gc,marking   ] GC(5) Concurrent Mark From Roots
[20.098s][info][gc,task      ] GC(5) Using 2 workers of 2 for marking
[20.101s][info][gc,start     ] GC(6) Pause Young (Normal) (G1 Evacuation Pause)
[20.102s][info][gc,task      ] GC(6) Using 3 workers of 8 for evacuation
[20.110s][info][gc,phases    ] GC(6)   Pre Evacuate Collection Set: 0.0ms
[20.111s][info][gc,phases    ] GC(6)   Evacuate Collection Set: 8.4ms
[20.111s][info][gc,phases    ] GC(6)   Post Evacuate Collection Set: 0.5ms
[20.111s][info][gc,phases    ] GC(6)   Other: 0.2ms
[20.111s][info][gc,heap      ] GC(6) Eden regions: 9->0(5)
[20.111s][info][gc,heap      ] GC(6) Survivor regions: 2->2(2)
[20.111s][info][gc,heap      ] GC(6) Old regions: 73->83
[20.111s][info][gc,heap      ] GC(6) Archive regions: 0->0
[20.111s][info][gc,heap      ] GC(6) Humongous regions: 11->11
[20.111s][info][gc,metaspace ] GC(6) Metaspace: 2442K->2442K(1056768K)
[20.111s][info][gc           ] GC(6) Pause Young (Normal) (G1 Evacuation Pause) 95M->95M(128M) 9.195ms
[20.111s][info][gc,cpu       ] GC(6) User=0.00s Sys=0.00s Real=0.01s
[20.115s][info][gc,start     ] GC(7) Pause Young (Normal) (G1 Evacuation Pause)
[20.115s][info][gc,task      ] GC(7) Using 3 workers of 8 for evacuation
[20.121s][info][gc,phases    ] GC(7)   Pre Evacuate Collection Set: 0.0ms
[20.122s][info][gc,phases    ] GC(7)   Evacuate Collection Set: 5.4ms
[20.122s][info][gc,phases    ] GC(7)   Post Evacuate Collection Set: 0.5ms
[20.122s][info][gc,phases    ] GC(7)   Other: 0.1ms
[20.122s][info][gc,heap      ] GC(7) Eden regions: 5->0(5)
[20.122s][info][gc,heap      ] GC(7) Survivor regions: 2->1(1)
[20.122s][info][gc,heap      ] GC(7) Old regions: 83->90
[20.122s][info][gc,heap      ] GC(7) Archive regions: 0->0
[20.122s][info][gc,heap      ] GC(7) Humongous regions: 11->11
[20.122s][info][gc,metaspace ] GC(7) Metaspace: 2447K->2447K(1056768K)
[20.122s][info][gc           ] GC(7) Pause Young (Normal) (G1 Evacuation Pause) 100M->101M(128M) 6.294ms
[20.122s][info][gc,cpu       ] GC(7) User=0.03s Sys=0.02s Real=0.01s
[20.126s][info][gc,start     ] GC(8) Pause Young (Normal) (G1 Evacuation Pause)
[20.126s][info][gc,task      ] GC(8) Using 3 workers of 8 for evacuation
[20.131s][info][gc,phases    ] GC(8)   Pre Evacuate Collection Set: 0.0ms
[20.131s][info][gc,phases    ] GC(8)   Evacuate Collection Set: 3.8ms
[20.131s][info][gc,phases    ] GC(8)   Post Evacuate Collection Set: 0.5ms
[20.131s][info][gc,phases    ] GC(8)   Other: 0.1ms
[20.131s][info][gc,heap      ] GC(8) Eden regions: 5->0(5)
[20.131s][info][gc,heap      ] GC(8) Survivor regions: 1->1(1)
[20.131s][info][gc,heap      ] GC(8) Old regions: 90->95
[20.131s][info][gc,heap      ] GC(8) Archive regions: 0->0
[20.131s][info][gc,heap      ] GC(8) Humongous regions: 11->11
[20.131s][info][gc,metaspace ] GC(8) Metaspace: 2448K->2448K(1056768K)
[20.131s][info][gc           ] GC(8) Pause Young (Normal) (G1 Evacuation Pause) 106M->107M(128M) 4.649ms
[20.131s][info][gc,cpu       ] GC(8) User=0.02s Sys=0.00s Real=0.01s
[20.137s][info][gc,start     ] GC(9) Pause Young (Normal) (G1 Evacuation Pause)
[20.137s][info][gc,task      ] GC(9) Using 3 workers of 8 for evacuation
[20.142s][info][gc,phases    ] GC(9)   Pre Evacuate Collection Set: 0.0ms
[20.142s][info][gc,phases    ] GC(9)   Evacuate Collection Set: 5.2ms
[20.142s][info][gc,phases    ] GC(9)   Post Evacuate Collection Set: 0.5ms
[20.142s][info][gc,phases    ] GC(9)   Other: 0.1ms
[20.142s][info][gc,heap      ] GC(9) Eden regions: 5->0(5)
[20.142s][info][gc,heap      ] GC(9) Survivor regions: 1->1(1)
[20.142s][info][gc,heap      ] GC(9) Old regions: 95->101
[20.142s][info][gc,heap      ] GC(9) Archive regions: 0->0
[20.142s][info][gc,heap      ] GC(9) Humongous regions: 16->16
[20.142s][info][gc,metaspace ] GC(9) Metaspace: 2453K->2453K(1056768K)
[20.142s][info][gc           ] GC(9) Pause Young (Normal) (G1 Evacuation Pause) 117M->117M(128M) 5.979ms
[20.143s][info][gc,cpu       ] GC(9) User=0.00s Sys=0.00s Real=0.01s
[20.143s][info][gc,marking   ] GC(5) Concurrent Mark From Roots 44.883ms
[20.143s][info][gc,marking   ] GC(5) Concurrent Preclean
[20.143s][info][gc,marking   ] GC(5) Concurrent Preclean 0.123ms
[20.143s][info][gc,marking   ] GC(5) Concurrent Mark (20.098s, 20.143s) 45.103ms
[20.143s][info][gc,start     ] GC(5) Pause Remark
[20.144s][info][gc           ] GC(5) Pause Remark 117M->108M(128M) 1.091ms
[20.144s][info][gc,cpu       ] GC(5) User=0.00s Sys=0.00s Real=0.00s
[20.144s][info][gc,marking   ] GC(5) Concurrent Rebuild Remembered Sets
[20.148s][info][gc,start     ] GC(10) Pause Young (Normal) (G1 Evacuation Pause)
[20.148s][info][gc,task      ] GC(10) Using 3 workers of 8 for evacuation
[20.153s][info][gc,phases    ] GC(10)   Pre Evacuate Collection Set: 0.0ms
[20.153s][info][gc,phases    ] GC(10)   Evacuate Collection Set: 4.3ms
[20.153s][info][gc,phases    ] GC(10)   Post Evacuate Collection Set: 0.4ms
[20.153s][info][gc,phases    ] GC(10)   Other: 0.2ms
[20.153s][info][gc,heap      ] GC(10) Eden regions: 5->0(5)
[20.153s][info][gc,heap      ] GC(10) Survivor regions: 1->1(1)
[20.153s][info][gc,heap      ] GC(10) Old regions: 99->104
[20.153s][info][gc,heap      ] GC(10) Archive regions: 0->0
[20.153s][info][gc,heap      ] GC(10) Humongous regions: 9->9
[20.153s][info][gc,metaspace ] GC(10) Metaspace: 2453K->2453K(1056768K)
[20.153s][info][gc           ] GC(10) Pause Young (Normal) (G1 Evacuation Pause) 113M->114M(128M) 5.056ms
[20.153s][info][gc,cpu       ] GC(10) User=0.00s Sys=0.00s Real=0.01s
[20.158s][info][gc,start     ] GC(11) Pause Young (Normal) (G1 Evacuation Pause)
[20.158s][info][gc,task      ] GC(11) Using 3 workers of 8 for evacuation
[20.163s][info][gc,phases    ] GC(11)   Pre Evacuate Collection Set: 0.0ms
[20.163s][info][gc,phases    ] GC(11)   Evacuate Collection Set: 3.9ms
[20.163s][info][gc,phases    ] GC(11)   Post Evacuate Collection Set: 0.4ms
[20.163s][info][gc,phases    ] GC(11)   Other: 0.1ms
[20.163s][info][gc,heap      ] GC(11) Eden regions: 5->0(5)
[20.163s][info][gc,heap      ] GC(11) Survivor regions: 1->1(1)
[20.163s][info][gc,heap      ] GC(11) Old regions: 104->110
[20.163s][info][gc,heap      ] GC(11) Archive regions: 0->0
[20.163s][info][gc,heap      ] GC(11) Humongous regions: 9->9
[20.163s][info][gc,metaspace ] GC(11) Metaspace: 2454K->2454K(1056768K)
[20.163s][info][gc           ] GC(11) Pause Young (Normal) (G1 Evacuation Pause) 119M->119M(128M) 4.604ms
[20.163s][info][gc,cpu       ] GC(11) User=0.03s Sys=0.00s Real=0.01s
[20.167s][info][gc,start     ] GC(12) Pause Young (Normal) (G1 Evacuation Pause)
[20.167s][info][gc,task      ] GC(12) Using 3 workers of 8 for evacuation
[20.174s][info][gc           ] GC(12) To-space exhausted
[20.174s][info][gc,phases    ] GC(12)   Pre Evacuate Collection Set: 0.0ms
[20.174s][info][gc,phases    ] GC(12)   Evacuate Collection Set: 5.3ms
[20.174s][info][gc,phases    ] GC(12)   Post Evacuate Collection Set: 1.6ms
[20.174s][info][gc,phases    ] GC(12)   Other: 0.2ms
[20.174s][info][gc,heap      ] GC(12) Eden regions: 5->0(5)
[20.174s][info][gc,heap      ] GC(12) Survivor regions: 1->1(1)
[20.174s][info][gc,heap      ] GC(12) Old regions: 110->115
[20.174s][info][gc,heap      ] GC(12) Archive regions: 0->0
[20.174s][info][gc,heap      ] GC(12) Humongous regions: 9->9
[20.174s][info][gc,metaspace ] GC(12) Metaspace: 2454K->2454K(1056768K)
[20.174s][info][gc           ] GC(12) Pause Young (Normal) (G1 Evacuation Pause) 124M->125M(128M) 7.341ms
[20.175s][info][gc,cpu       ] GC(12) User=0.00s Sys=0.00s Real=0.01s
[20.177s][info][gc,start     ] GC(13) Pause Young (Normal) (G1 Evacuation Pause)
[20.177s][info][gc,task      ] GC(13) Using 3 workers of 8 for evacuation
[20.186s][info][gc           ] GC(13) To-space exhausted
[20.186s][info][gc,phases    ] GC(13)   Pre Evacuate Collection Set: 0.0ms
[20.186s][info][gc,phases    ] GC(13)   Evacuate Collection Set: 5.6ms
[20.186s][info][gc,phases    ] GC(13)   Post Evacuate Collection Set: 2.7ms
[20.186s][info][gc,phases    ] GC(13)   Other: 0.2ms
[20.186s][info][gc,heap      ] GC(13) Eden regions: 3->0(6)
[20.186s][info][gc,heap      ] GC(13) Survivor regions: 1->0(0)
[20.186s][info][gc,heap      ] GC(13) Old regions: 115->119
[20.186s][info][gc,heap      ] GC(13) Archive regions: 0->0
[20.186s][info][gc,heap      ] GC(13) Humongous regions: 9->9
[20.186s][info][gc,metaspace ] GC(13) Metaspace: 2455K->2455K(1056768K)
[20.186s][info][gc           ] GC(13) Pause Young (Normal) (G1 Evacuation Pause) 128M->128M(128M) 8.707ms
[20.186s][info][gc,cpu       ] GC(13) User=0.05s Sys=0.00s Real=0.01s
[20.186s][info][gc,task      ] GC(14) Using 3 workers of 8 for full compaction
[20.186s][info][gc,start     ] GC(14) Pause Full (G1 Evacuation Pause)
[20.187s][info][gc,phases,start] GC(14) Phase 1: Mark live objects
[20.220s][info][gc,phases      ] GC(14) Phase 1: Mark live objects 33.002ms
[20.220s][info][gc,phases,start] GC(14) Phase 2: Prepare for compaction
[20.229s][info][gc,phases      ] GC(14) Phase 2: Prepare for compaction 9.369ms
[20.229s][info][gc,phases,start] GC(14) Phase 3: Adjust pointers
[20.243s][info][gc,phases      ] GC(14) Phase 3: Adjust pointers 13.528ms
[20.243s][info][gc,phases,start] GC(14) Phase 4: Compact heap
[20.254s][info][gc,phases      ] GC(14) Phase 4: Compact heap 11.503ms
[20.255s][info][gc,heap        ] GC(14) Eden regions: 0->0(9)
[20.255s][info][gc,heap        ] GC(14) Survivor regions: 0->0(0)
[20.255s][info][gc,heap        ] GC(14) Old regions: 119->82
[20.255s][info][gc,heap        ] GC(14) Archive regions: 0->0
[20.255s][info][gc,heap        ] GC(14) Humongous regions: 9->5
[20.255s][info][gc,metaspace   ] GC(14) Metaspace: 2455K->2409K(1056768K)
[20.255s][info][gc             ] GC(14) Pause Full (G1 Evacuation Pause) 128M->84M(128M) 69.061ms
[20.255s][info][gc,cpu         ] GC(14) User=0.19s Sys=0.00s Real=0.07s
[20.255s][info][gc,marking     ] GC(5) Concurrent Rebuild Remembered Sets 111.084ms
[20.255s][info][gc,marking     ] GC(5) Concurrent Mark Abort
[20.256s][info][gc             ] GC(5) Concurrent Cycle 160.982ms
[20.261s][info][gc,start       ] GC(15) Pause Young (Concurrent Start) (G1 Humongous Allocation)
[20.261s][info][gc,task        ] GC(15) Using 3 workers of 8 for evacuation
[20.265s][info][gc,phases      ] GC(15)   Pre Evacuate Collection Set: 0.0ms
[20.265s][info][gc,phases      ] GC(15)   Evacuate Collection Set: 3.8ms
[20.265s][info][gc,phases      ] GC(15)   Post Evacuate Collection Set: 0.6ms
[20.265s][info][gc,phases      ] GC(15)   Other: 0.2ms
[20.265s][info][gc,heap        ] GC(15) Eden regions: 6->0(7)
[20.265s][info][gc,heap        ] GC(15) Survivor regions: 0->2(2)
[20.265s][info][gc,heap        ] GC(15) Old regions: 82->86
[20.265s][info][gc,heap        ] GC(15) Archive regions: 0->0
[20.265s][info][gc,heap        ] GC(15) Humongous regions: 5->5
[20.265s][info][gc,metaspace   ] GC(15) Metaspace: 2419K->2419K(1056768K)
[20.266s][info][gc             ] GC(15) Pause Young (Concurrent Start) (G1 Humongous Allocation) 90M->90M(128M) 4.780ms
[20.266s][info][gc,cpu         ] GC(15) User=0.00s Sys=0.00s Real=0.00s
[20.266s][info][gc             ] GC(16) Concurrent Cycle
[20.266s][info][gc,marking     ] GC(16) Concurrent Clear Claimed Marks
[20.266s][info][gc,marking     ] GC(16) Concurrent Clear Claimed Marks 0.019ms
[20.266s][info][gc,marking     ] GC(16) Concurrent Scan Root Regions
[20.267s][info][gc,marking     ] GC(16) Concurrent Scan Root Regions 1.098ms
[20.267s][info][gc,marking     ] GC(16) Concurrent Mark (20.267s)
[20.267s][info][gc,marking     ] GC(16) Concurrent Mark From Roots
[20.267s][info][gc,task        ] GC(16) Using 2 workers of 2 for marking
[20.326s][info][gc,marking     ] GC(16) Concurrent Mark From Roots 59.099ms
[20.326s][info][gc,marking     ] GC(16) Concurrent Preclean
[20.326s][info][gc,marking     ] GC(16) Concurrent Preclean 0.109ms
[20.326s][info][gc,marking     ] GC(16) Concurrent Mark (20.267s, 20.326s) 59.288ms
[20.331s][info][gc,start       ] GC(16) Pause Remark
[20.332s][info][gc             ] GC(16) Pause Remark 103M->103M(128M) 0.884ms
[20.332s][info][gc,cpu         ] GC(16) User=0.00s Sys=0.00s Real=0.00s
[20.332s][info][gc,marking     ] GC(16) Concurrent Rebuild Remembered Sets
[20.381s][info][gc,marking     ] GC(16) Concurrent Rebuild Remembered Sets 49.364ms
[20.382s][info][gc,start       ] GC(16) Pause Cleanup
[20.382s][info][gc             ] GC(16) Pause Cleanup 103M->103M(128M) 0.102ms
[20.382s][info][gc,cpu         ] GC(16) User=0.00s Sys=0.00s Real=0.00s
[20.382s][info][gc,marking     ] GC(16) Concurrent Cleanup for Next Mark
[20.382s][info][gc,marking     ] GC(16) Concurrent Cleanup for Next Mark 0.573ms
[20.382s][info][gc             ] GC(16) Concurrent Cycle 116.762ms
[88.720s][info][gc,start       ] GC(17) Pause Young (Normal) (G1 Evacuation Pause)
[88.720s][info][gc,task        ] GC(17) Using 3 workers of 8 for evacuation
[88.728s][info][gc,phases      ] GC(17)   Pre Evacuate Collection Set: 0.0ms
[88.728s][info][gc,phases      ] GC(17)   Evacuate Collection Set: 7.2ms
[88.728s][info][gc,phases      ] GC(17)   Post Evacuate Collection Set: 0.5ms
[88.728s][info][gc,phases      ] GC(17)   Other: 0.2ms
[88.728s][info][gc,heap        ] GC(17) Eden regions: 7->0(4)
[88.728s][info][gc,heap        ] GC(17) Survivor regions: 2->2(2)
[88.728s][info][gc,heap        ] GC(17) Old regions: 86->90
[88.728s][info][gc,heap        ] GC(17) Archive regions: 0->0
[88.728s][info][gc,heap        ] GC(17) Humongous regions: 12->12
[88.728s][info][gc,metaspace   ] GC(17) Metaspace: 2421K->2421K(1056768K)
[88.728s][info][gc             ] GC(17) Pause Young (Normal) (G1 Evacuation Pause) 104M->101M(128M) 8.023ms
[88.729s][info][gc,cpu         ] GC(17) User=0.05s Sys=0.00s Real=0.01s
[88.732s][info][gc,start       ] GC(18) Pause Young (Concurrent Start) (G1 Evacuation Pause)
[88.732s][info][gc,task        ] GC(18) Using 3 workers of 8 for evacuation
[88.736s][info][gc,phases      ] GC(18)   Pre Evacuate Collection Set: 0.0ms
[88.736s][info][gc,phases      ] GC(18)   Evacuate Collection Set: 4.0ms
[88.736s][info][gc,phases      ] GC(18)   Post Evacuate Collection Set: 0.4ms
[88.736s][info][gc,phases      ] GC(18)   Other: 0.2ms
[88.736s][info][gc,heap        ] GC(18) Eden regions: 4->0(5)
[88.736s][info][gc,heap        ] GC(18) Survivor regions: 2->1(1)
[88.736s][info][gc,heap        ] GC(18) Old regions: 90->95
[88.736s][info][gc,heap        ] GC(18) Archive regions: 0->0
[88.736s][info][gc,heap        ] GC(18) Humongous regions: 12->12
[88.736s][info][gc,metaspace   ] GC(18) Metaspace: 2422K->2422K(1056768K)
[88.737s][info][gc             ] GC(18) Pause Young (Concurrent Start) (G1 Evacuation Pause) 105M->105M(128M) 4.801ms
[88.737s][info][gc,cpu         ] GC(18) User=0.00s Sys=0.00s Real=0.01s
[88.737s][info][gc             ] GC(19) Concurrent Cycle
[88.737s][info][gc,marking     ] GC(19) Concurrent Clear Claimed Marks
[88.737s][info][gc,marking     ] GC(19) Concurrent Clear Claimed Marks 0.027ms
[88.737s][info][gc,marking     ] GC(19) Concurrent Scan Root Regions
[88.738s][info][gc,marking     ] GC(19) Concurrent Scan Root Regions 1.584ms
[88.738s][info][gc,marking     ] GC(19) Concurrent Mark (88.738s)
[88.738s][info][gc,marking     ] GC(19) Concurrent Mark From Roots
[88.738s][info][gc,task        ] GC(19) Using 2 workers of 2 for marking
[88.741s][info][gc,start       ] GC(20) Pause Young (Normal) (G1 Evacuation Pause)
[88.741s][info][gc,task        ] GC(20) Using 3 workers of 8 for evacuation
[88.746s][info][gc,phases      ] GC(20)   Pre Evacuate Collection Set: 0.0ms
[88.746s][info][gc,phases      ] GC(20)   Evacuate Collection Set: 4.2ms
[88.746s][info][gc,phases      ] GC(20)   Post Evacuate Collection Set: 0.2ms
[88.746s][info][gc,phases      ] GC(20)   Other: 0.2ms
[88.746s][info][gc,heap        ] GC(20) Eden regions: 5->0(5)
[88.746s][info][gc,heap        ] GC(20) Survivor regions: 1->1(1)
[88.746s][info][gc,heap        ] GC(20) Old regions: 95->100
[88.746s][info][gc,heap        ] GC(20) Archive regions: 0->0
[88.746s][info][gc,heap        ] GC(20) Humongous regions: 12->12
[88.746s][info][gc,metaspace   ] GC(20) Metaspace: 2425K->2425K(1056768K)
[88.746s][info][gc             ] GC(20) Pause Young (Normal) (G1 Evacuation Pause) 110M->110M(128M) 4.941ms
[88.746s][info][gc,cpu         ] GC(20) User=0.00s Sys=0.00s Real=0.01s
[88.753s][info][gc,start       ] GC(21) Pause Young (Normal) (G1 Evacuation Pause)
[88.753s][info][gc,task        ] GC(21) Using 3 workers of 8 for evacuation
[88.757s][info][gc,phases      ] GC(21)   Pre Evacuate Collection Set: 0.0ms
[88.757s][info][gc,phases      ] GC(21)   Evacuate Collection Set: 3.8ms
[88.757s][info][gc,phases      ] GC(21)   Post Evacuate Collection Set: 0.4ms
[88.757s][info][gc,phases      ] GC(21)   Other: 0.1ms
[88.757s][info][gc,heap        ] GC(21) Eden regions: 5->0(5)
[88.757s][info][gc,heap        ] GC(21) Survivor regions: 1->1(1)
[88.757s][info][gc,heap        ] GC(21) Old regions: 100->106
[88.757s][info][gc,heap        ] GC(21) Archive regions: 0->0
[88.757s][info][gc,heap        ] GC(21) Humongous regions: 12->12
[88.757s][info][gc,metaspace   ] GC(21) Metaspace: 2425K->2425K(1056768K)
[88.757s][info][gc             ] GC(21) Pause Young (Normal) (G1 Evacuation Pause) 115M->115M(128M) 4.567ms
[88.757s][info][gc,cpu         ] GC(21) User=0.05s Sys=0.00s Real=0.00s
[88.761s][info][gc,start       ] GC(22) Pause Young (Normal) (G1 Evacuation Pause)
[88.761s][info][gc,task        ] GC(22) Using 3 workers of 8 for evacuation
[88.767s][info][gc             ] GC(22) To-space exhausted
[88.767s][info][gc,phases      ] GC(22)   Pre Evacuate Collection Set: 0.0ms
[88.767s][info][gc,phases      ] GC(22)   Evacuate Collection Set: 4.3ms
[88.767s][info][gc,phases      ] GC(22)   Post Evacuate Collection Set: 1.5ms
[88.767s][info][gc,phases      ] GC(22)   Other: 0.2ms
[88.767s][info][gc,heap        ] GC(22) Eden regions: 5->0(5)
[88.767s][info][gc,heap        ] GC(22) Survivor regions: 1->1(1)
[88.767s][info][gc,heap        ] GC(22) Old regions: 106->112
[88.767s][info][gc,heap        ] GC(22) Archive regions: 0->0
[88.767s][info][gc,heap        ] GC(22) Humongous regions: 12->12
[88.767s][info][gc,metaspace   ] GC(22) Metaspace: 2425K->2425K(1056768K)
[88.767s][info][gc             ] GC(22) Pause Young (Normal) (G1 Evacuation Pause) 120M->122M(128M) 6.129ms
[88.767s][info][gc,cpu         ] GC(22) User=0.00s Sys=0.00s Real=0.01s
[88.770s][info][gc,start       ] GC(23) Pause Young (Normal) (G1 Evacuation Pause)
[88.770s][info][gc,task        ] GC(23) Using 3 workers of 8 for evacuation
[88.779s][info][gc             ] GC(23) To-space exhausted
[88.779s][info][gc,phases      ] GC(23)   Pre Evacuate Collection Set: 0.0ms
[88.779s][info][gc,phases      ] GC(23)   Evacuate Collection Set: 5.4ms
[88.779s][info][gc,phases      ] GC(23)   Post Evacuate Collection Set: 3.6ms
[88.780s][info][gc,phases      ] GC(23)   Other: 0.3ms
[88.780s][info][gc,heap        ] GC(23) Eden regions: 3->0(6)
[88.780s][info][gc,heap        ] GC(23) Survivor regions: 1->0(0)
[88.780s][info][gc,heap        ] GC(23) Old regions: 112->116
[88.780s][info][gc,heap        ] GC(23) Archive regions: 0->0
[88.780s][info][gc,heap        ] GC(23) Humongous regions: 12->12
[88.780s][info][gc,metaspace   ] GC(23) Metaspace: 2425K->2425K(1056768K)
[88.780s][info][gc             ] GC(23) Pause Young (Normal) (G1 Evacuation Pause) 125M->125M(128M) 9.637ms
[88.780s][info][gc,cpu         ] GC(23) User=0.05s Sys=0.00s Real=0.01s
[88.780s][info][gc,task        ] GC(24) Using 3 workers of 8 for full compaction
[88.780s][info][gc,start       ] GC(24) Pause Full (G1 Evacuation Pause)
[88.780s][info][gc,phases,start] GC(24) Phase 1: Mark live objects
[88.804s][info][gc,phases      ] GC(24) Phase 1: Mark live objects 23.935ms
[88.804s][info][gc,phases,start] GC(24) Phase 2: Prepare for compaction
[88.813s][info][gc,phases      ] GC(24) Phase 2: Prepare for compaction 9.136ms
[88.813s][info][gc,phases,start] GC(24) Phase 3: Adjust pointers
[88.827s][info][gc,phases      ] GC(24) Phase 3: Adjust pointers 13.301ms
[88.827s][info][gc,phases,start] GC(24) Phase 4: Compact heap
[88.838s][info][gc,phases      ] GC(24) Phase 4: Compact heap 11.117ms
[88.838s][info][gc,heap        ] GC(24) Eden regions: 0->0(12)
[88.838s][info][gc,heap        ] GC(24) Survivor regions: 0->0(0)
[88.839s][info][gc,heap        ] GC(24) Old regions: 116->70
[88.839s][info][gc,heap        ] GC(24) Archive regions: 0->0
[88.839s][info][gc,heap        ] GC(24) Humongous regions: 12->7
[88.839s][info][gc,metaspace   ] GC(24) Metaspace: 2425K->2425K(1056768K)
[88.839s][info][gc             ] GC(24) Pause Full (G1 Evacuation Pause) 125M->75M(128M) 58.544ms
[88.839s][info][gc,cpu         ] GC(24) User=0.19s Sys=0.00s Real=0.06s
[88.839s][info][gc,marking     ] GC(19) Concurrent Mark From Roots 100.514ms
[88.839s][info][gc,marking     ] GC(19) Concurrent Mark Abort
[88.839s][info][gc             ] GC(19) Concurrent Cycle 102.342ms
[88.848s][info][gc,start       ] GC(25) Pause Young (Normal) (G1 Evacuation Pause)
[88.848s][info][gc,task        ] GC(25) Using 3 workers of 8 for evacuation
[88.855s][info][gc,phases      ] GC(25)   Pre Evacuate Collection Set: 0.0ms
[88.855s][info][gc,phases      ] GC(25)   Evacuate Collection Set: 6.7ms
[88.855s][info][gc,phases      ] GC(25)   Post Evacuate Collection Set: 0.4ms
[88.855s][info][gc,phases      ] GC(25)   Other: 0.1ms
[88.855s][info][gc,heap        ] GC(25) Eden regions: 12->0(8)
[88.855s][info][gc,heap        ] GC(25) Survivor regions: 0->2(2)
[88.855s][info][gc,heap        ] GC(25) Old regions: 70->80
[88.855s][info][gc,heap        ] GC(25) Archive regions: 0->0
[88.855s][info][gc,heap        ] GC(25) Humongous regions: 7->7
[88.855s][info][gc,metaspace   ] GC(25) Metaspace: 2425K->2425K(1056768K)
[88.855s][info][gc             ] GC(25) Pause Young (Normal) (G1 Evacuation Pause) 87M->87M(128M) 7.400ms
[88.855s][info][gc,cpu         ] GC(25) User=0.05s Sys=0.00s Real=0.01s
[88.861s][info][gc,start       ] GC(26) Pause Young (Concurrent Start) (G1 Evacuation Pause)
[88.861s][info][gc,task        ] GC(26) Using 3 workers of 8 for evacuation
[88.868s][info][gc,phases      ] GC(26)   Pre Evacuate Collection Set: 0.0ms
[88.868s][info][gc,phases      ] GC(26)   Evacuate Collection Set: 5.9ms
[88.868s][info][gc,phases      ] GC(26)   Post Evacuate Collection Set: 0.4ms
[88.868s][info][gc,phases      ] GC(26)   Other: 0.1ms
[88.868s][info][gc,heap        ] GC(26) Eden regions: 8->0(5)
[88.868s][info][gc,heap        ] GC(26) Survivor regions: 2->2(2)
[88.868s][info][gc,heap        ] GC(26) Old regions: 80->89
[88.868s][info][gc,heap        ] GC(26) Archive regions: 0->0
[88.868s][info][gc,heap        ] GC(26) Humongous regions: 7->7
[88.868s][info][gc,metaspace   ] GC(26) Metaspace: 2425K->2425K(1056768K)
[88.868s][info][gc             ] GC(26) Pause Young (Concurrent Start) (G1 Evacuation Pause) 95M->96M(128M) 6.697ms
[88.868s][info][gc,cpu         ] GC(26) User=0.05s Sys=0.00s Real=0.01s
[88.868s][info][gc             ] GC(27) Concurrent Cycle
[88.868s][info][gc,marking     ] GC(27) Concurrent Clear Claimed Marks
[88.868s][info][gc,marking     ] GC(27) Concurrent Clear Claimed Marks 0.032ms
[88.868s][info][gc,marking     ] GC(27) Concurrent Scan Root Regions
[88.870s][info][gc,marking     ] GC(27) Concurrent Scan Root Regions 2.001ms
[88.870s][info][gc,marking     ] GC(27) Concurrent Mark (88.870s)
[88.870s][info][gc,marking     ] GC(27) Concurrent Mark From Roots
[88.870s][info][gc,task        ] GC(27) Using 2 workers of 2 for marking
[88.872s][info][gc,start       ] GC(28) Pause Young (Normal) (G1 Evacuation Pause)
[88.872s][info][gc,task        ] GC(28) Using 3 workers of 8 for evacuation
[88.877s][info][gc,phases      ] GC(28)   Pre Evacuate Collection Set: 0.0ms
[88.877s][info][gc,phases      ] GC(28)   Evacuate Collection Set: 4.3ms
[88.877s][info][gc,phases      ] GC(28)   Post Evacuate Collection Set: 0.5ms
[88.877s][info][gc,phases      ] GC(28)   Other: 0.2ms
[88.877s][info][gc,heap        ] GC(28) Eden regions: 5->0(5)
[88.877s][info][gc,heap        ] GC(28) Survivor regions: 2->1(1)
[88.877s][info][gc,heap        ] GC(28) Old regions: 89->96
[88.877s][info][gc,heap        ] GC(28) Archive regions: 0->0
[88.877s][info][gc,heap        ] GC(28) Humongous regions: 7->7
[88.877s][info][gc,metaspace   ] GC(28) Metaspace: 2428K->2428K(1056768K)
[88.877s][info][gc             ] GC(28) Pause Young (Normal) (G1 Evacuation Pause) 101M->102M(128M) 5.104ms
[88.877s][info][gc,cpu         ] GC(28) User=0.00s Sys=0.00s Real=0.01s
[88.881s][info][gc,start       ] GC(29) Pause Young (Normal) (G1 Evacuation Pause)
[88.881s][info][gc,task        ] GC(29) Using 3 workers of 8 for evacuation
[88.885s][info][gc,phases      ] GC(29)   Pre Evacuate Collection Set: 0.0ms
[88.885s][info][gc,phases      ] GC(29)   Evacuate Collection Set: 3.7ms
[88.885s][info][gc,phases      ] GC(29)   Post Evacuate Collection Set: 0.3ms
[88.885s][info][gc,phases      ] GC(29)   Other: 0.2ms
[88.885s][info][gc,heap        ] GC(29) Eden regions: 5->0(5)
[88.885s][info][gc,heap        ] GC(29) Survivor regions: 1->1(1)
[88.885s][info][gc,heap        ] GC(29) Old regions: 96->102
[88.885s][info][gc,heap        ] GC(29) Archive regions: 0->0
[88.885s][info][gc,heap        ] GC(29) Humongous regions: 7->7
[88.885s][info][gc,metaspace   ] GC(29) Metaspace: 2430K->2430K(1056768K)
[88.885s][info][gc             ] GC(29) Pause Young (Normal) (G1 Evacuation Pause) 107M->108M(128M) 4.409ms
[88.885s][info][gc,cpu         ] GC(29) User=0.02s Sys=0.00s Real=0.00s
[88.889s][info][gc,start       ] GC(30) Pause Young (Normal) (G1 Evacuation Pause)
[88.889s][info][gc,task        ] GC(30) Using 3 workers of 8 for evacuation
[88.893s][info][gc,phases      ] GC(30)   Pre Evacuate Collection Set: 0.0ms
[88.893s][info][gc,phases      ] GC(30)   Evacuate Collection Set: 3.7ms
[88.893s][info][gc,phases      ] GC(30)   Post Evacuate Collection Set: 0.3ms
[88.893s][info][gc,phases      ] GC(30)   Other: 0.1ms
[88.893s][info][gc,heap        ] GC(30) Eden regions: 5->0(5)
[88.893s][info][gc,heap        ] GC(30) Survivor regions: 1->1(1)
[88.893s][info][gc,heap        ] GC(30) Old regions: 102->108
[88.893s][info][gc,heap        ] GC(30) Archive regions: 0->0
[88.893s][info][gc,heap        ] GC(30) Humongous regions: 7->7
[88.893s][info][gc,metaspace   ] GC(30) Metaspace: 2430K->2430K(1056768K)
[88.893s][info][gc             ] GC(30) Pause Young (Normal) (G1 Evacuation Pause) 113M->114M(128M) 4.307ms
[88.893s][info][gc,cpu         ] GC(30) User=0.00s Sys=0.00s Real=0.00s
[88.897s][info][gc,start       ] GC(31) Pause Young (Normal) (G1 Evacuation Pause)
[88.897s][info][gc,task        ] GC(31) Using 3 workers of 8 for evacuation
[88.902s][info][gc,phases      ] GC(31)   Pre Evacuate Collection Set: 0.0ms
[88.902s][info][gc,phases      ] GC(31)   Evacuate Collection Set: 4.2ms
[88.902s][info][gc,phases      ] GC(31)   Post Evacuate Collection Set: 0.4ms
[88.902s][info][gc,phases      ] GC(31)   Other: 0.1ms
[88.902s][info][gc,heap        ] GC(31) Eden regions: 5->0(5)
[88.902s][info][gc,heap        ] GC(31) Survivor regions: 1->1(1)
[88.902s][info][gc,heap        ] GC(31) Old regions: 108->113
[88.902s][info][gc,heap        ] GC(31) Archive regions: 0->0
[88.902s][info][gc,heap        ] GC(31) Humongous regions: 7->7
[88.902s][info][gc,metaspace   ] GC(31) Metaspace: 2430K->2430K(1056768K)
[88.902s][info][gc             ] GC(31) Pause Young (Normal) (G1 Evacuation Pause) 119M->119M(128M) 4.986ms
[88.902s][info][gc,cpu         ] GC(31) User=0.00s Sys=0.00s Real=0.00s
[88.906s][info][gc,start       ] GC(32) Pause Young (Normal) (G1 Evacuation Pause)
[88.906s][info][gc,task        ] GC(32) Using 3 workers of 8 for evacuation
[88.914s][info][gc             ] GC(32) To-space exhausted
[88.914s][info][gc,phases      ] GC(32)   Pre Evacuate Collection Set: 0.0ms
[88.914s][info][gc,phases      ] GC(32)   Evacuate Collection Set: 5.4ms
[88.914s][info][gc,phases      ] GC(32)   Post Evacuate Collection Set: 2.4ms
[88.914s][info][gc,phases      ] GC(32)   Other: 0.2ms
[88.914s][info][gc,heap        ] GC(32) Eden regions: 5->0(5)
[88.914s][info][gc,heap        ] GC(32) Survivor regions: 1->1(1)
[88.914s][info][gc,heap        ] GC(32) Old regions: 113->120
[88.914s][info][gc,heap        ] GC(32) Archive regions: 0->0
[88.914s][info][gc,heap        ] GC(32) Humongous regions: 7->7
[88.914s][info][gc,metaspace   ] GC(32) Metaspace: 2431K->2431K(1056768K)
[88.914s][info][gc             ] GC(32) Pause Young (Normal) (G1 Evacuation Pause) 124M->126M(128M) 8.253ms
[88.914s][info][gc,cpu         ] GC(32) User=0.05s Sys=0.00s Real=0.01s
[88.914s][info][gc,task        ] GC(33) Using 3 workers of 8 for full compaction
[88.914s][info][gc,start       ] GC(33) Pause Full (G1 Evacuation Pause)
[88.915s][info][gc,phases,start] GC(33) Phase 1: Mark live objects
[88.952s][info][gc,phases      ] GC(33) Phase 1: Mark live objects 37.918ms
[88.952s][info][gc,phases,start] GC(33) Phase 2: Prepare for compaction
[88.965s][info][gc,phases      ] GC(33) Phase 2: Prepare for compaction 12.762ms
[88.965s][info][gc,phases,start] GC(33) Phase 3: Adjust pointers
[88.982s][info][gc,phases      ] GC(33) Phase 3: Adjust pointers 16.473ms
[88.982s][info][gc,phases,start] GC(33) Phase 4: Compact heap
[88.994s][info][gc,phases      ] GC(33) Phase 4: Compact heap 11.842ms
[88.994s][info][gc,heap        ] GC(33) Eden regions: 0->0(6)
[88.994s][info][gc,heap        ] GC(33) Survivor regions: 1->0(1)
[88.994s][info][gc,heap        ] GC(33) Old regions: 120->115
[88.994s][info][gc,heap        ] GC(33) Archive regions: 0->0
[88.994s][info][gc,heap        ] GC(33) Humongous regions: 7->7
[88.994s][info][gc,metaspace   ] GC(33) Metaspace: 2431K->2431K(1056768K)
[88.994s][info][gc             ] GC(33) Pause Full (G1 Evacuation Pause) 126M->120M(128M) 80.198ms
[88.995s][info][gc,cpu         ] GC(33) User=0.23s Sys=0.00s Real=0.08s
[88.995s][info][gc,marking     ] GC(27) Concurrent Mark From Roots 124.680ms
[88.995s][info][gc,marking     ] GC(27) Concurrent Mark Abort
[88.995s][info][gc             ] GC(27) Concurrent Cycle 126.896ms
[89.000s][info][gc,start       ] GC(34) Pause Young (Normal) (G1 Evacuation Pause)
[89.000s][info][gc,task        ] GC(34) Using 3 workers of 8 for evacuation
[89.011s][info][gc             ] GC(34) To-space exhausted
[89.011s][info][gc,phases      ] GC(34)   Pre Evacuate Collection Set: 0.0ms
[89.011s][info][gc,phases      ] GC(34)   Evacuate Collection Set: 6.6ms
[89.011s][info][gc,phases      ] GC(34)   Post Evacuate Collection Set: 4.1ms
[89.011s][info][gc,phases      ] GC(34)   Other: 0.2ms
[89.011s][info][gc,heap        ] GC(34) Eden regions: 6->0(6)
[89.011s][info][gc,heap        ] GC(34) Survivor regions: 0->0(0)
[89.011s][info][gc,heap        ] GC(34) Old regions: 115->121
[89.011s][info][gc,heap        ] GC(34) Archive regions: 0->0
[89.011s][info][gc,heap        ] GC(34) Humongous regions: 7->7
[89.011s][info][gc,metaspace   ] GC(34) Metaspace: 2431K->2431K(1056768K)
[89.011s][info][gc             ] GC(34) Pause Young (Normal) (G1 Evacuation Pause) 126M->126M(128M) 11.153ms
[89.011s][info][gc,cpu         ] GC(34) User=0.05s Sys=0.00s Real=0.01s
[89.011s][info][gc,task        ] GC(35) Using 3 workers of 8 for full compaction
[89.011s][info][gc,start       ] GC(35) Pause Full (G1 Evacuation Pause)
[89.011s][info][gc,phases,start] GC(35) Phase 1: Mark live objects
[89.057s][info][gc,phases      ] GC(35) Phase 1: Mark live objects 45.840ms
[89.057s][info][gc,phases,start] GC(35) Phase 2: Prepare for compaction
[89.068s][info][gc,phases      ] GC(35) Phase 2: Prepare for compaction 10.942ms
[89.068s][info][gc,phases,start] GC(35) Phase 3: Adjust pointers
[89.083s][info][gc,phases      ] GC(35) Phase 3: Adjust pointers 14.573ms
[89.083s][info][gc,phases,start] GC(35) Phase 4: Compact heap
[89.092s][info][gc,phases      ] GC(35) Phase 4: Compact heap 8.854ms
[89.092s][info][gc,heap        ] GC(35) Eden regions: 0->0(6)
[89.092s][info][gc,heap        ] GC(35) Survivor regions: 0->0(0)
[89.092s][info][gc,heap        ] GC(35) Old regions: 121->120
[89.092s][info][gc,heap        ] GC(35) Archive regions: 0->0
[89.092s][info][gc,heap        ] GC(35) Humongous regions: 7->7
[89.092s][info][gc,metaspace   ] GC(35) Metaspace: 2431K->2431K(1056768K)
[89.092s][info][gc             ] GC(35) Pause Full (G1 Evacuation Pause) 126M->126M(128M) 81.056ms
[89.092s][info][gc,cpu         ] GC(35) User=0.23s Sys=0.00s Real=0.08s
[89.093s][info][gc,start       ] GC(36) Pause Young (Concurrent Start) (G1 Evacuation Pause)
[89.093s][info][gc,task        ] GC(36) Using 3 workers of 8 for evacuation
[89.097s][info][gc             ] GC(36) To-space exhausted
[89.097s][info][gc,phases      ] GC(36)   Pre Evacuate Collection Set: 0.0ms
[89.097s][info][gc,phases      ] GC(36)   Evacuate Collection Set: 2.0ms
[89.097s][info][gc,phases      ] GC(36)   Post Evacuate Collection Set: 1.7ms
[89.097s][info][gc,phases      ] GC(36)   Other: 0.2ms
[89.097s][info][gc,heap        ] GC(36) Eden regions: 1->0(6)
[89.097s][info][gc,heap        ] GC(36) Survivor regions: 0->0(0)
[89.097s][info][gc,heap        ] GC(36) Old regions: 120->121
[89.097s][info][gc,heap        ] GC(36) Archive regions: 0->0
[89.097s][info][gc,heap        ] GC(36) Humongous regions: 7->7
[89.097s][info][gc,metaspace   ] GC(36) Metaspace: 2431K->2431K(1056768K)
[89.097s][info][gc             ] GC(36) Pause Young (Concurrent Start) (G1 Evacuation Pause) 127M->127M(128M) 4.006ms
[89.097s][info][gc,cpu         ] GC(36) User=0.00s Sys=0.00s Real=0.00s
[89.097s][info][gc,task        ] GC(37) Using 3 workers of 8 for full compaction
[89.097s][info][gc             ] GC(38) Concurrent Cycle
[89.097s][info][gc,marking     ] GC(38) Concurrent Clear Claimed Marks
[89.098s][info][gc,marking     ] GC(38) Concurrent Clear Claimed Marks 0.022ms
[89.098s][info][gc,start       ] GC(37) Pause Full (G1 Evacuation Pause)
[89.098s][info][gc,marking     ] GC(38) Concurrent Scan Root Regions
[89.098s][info][gc,marking     ] GC(38) Concurrent Scan Root Regions 0.057ms
[89.098s][info][gc,marking     ] GC(38) Concurrent Mark (89.098s)
[89.098s][info][gc,marking     ] GC(38) Concurrent Mark From Roots
[89.098s][info][gc,task        ] GC(38) Using 2 workers of 2 for marking
[89.098s][info][gc,phases,start] GC(37) Phase 1: Mark live objects
[89.135s][info][gc,phases      ] GC(37) Phase 1: Mark live objects 37.056ms
[89.135s][info][gc,phases,start] GC(37) Phase 2: Prepare for compaction
[89.150s][info][gc,phases      ] GC(37) Phase 2: Prepare for compaction 14.977ms
[89.150s][info][gc,phases,start] GC(37) Phase 3: Adjust pointers
[89.165s][info][gc,phases      ] GC(37) Phase 3: Adjust pointers 15.448ms
[89.165s][info][gc,phases,start] GC(37) Phase 4: Compact heap
[89.178s][info][gc,phases      ] GC(37) Phase 4: Compact heap 12.882ms
[89.179s][info][gc,heap        ] GC(37) Eden regions: 0->0(6)
[89.179s][info][gc,heap        ] GC(37) Survivor regions: 0->0(0)
[89.179s][info][gc,heap        ] GC(37) Old regions: 121->121
[89.179s][info][gc,heap        ] GC(37) Archive regions: 0->0
[89.179s][info][gc,heap        ] GC(37) Humongous regions: 7->7
[89.179s][info][gc,metaspace   ] GC(37) Metaspace: 2431K->2431K(1056768K)
[89.179s][info][gc             ] GC(37) Pause Full (G1 Evacuation Pause) 127M->127M(128M) 81.434ms
[89.179s][info][gc,cpu         ] GC(37) User=0.25s Sys=0.00s Real=0.08s
[89.179s][info][gc,task        ] GC(39) Using 3 workers of 8 for full compaction
[89.179s][info][gc,start       ] GC(39) Pause Full (G1 Evacuation Pause)
[89.179s][info][gc,phases,start] GC(39) Phase 1: Mark live objects
[89.219s][info][gc,phases      ] GC(39) Phase 1: Mark live objects 39.935ms
[89.219s][info][gc,phases,start] GC(39) Phase 2: Prepare for compaction
[89.230s][info][gc,phases      ] GC(39) Phase 2: Prepare for compaction 11.059ms
[89.230s][info][gc,phases,start] GC(39) Phase 3: Adjust pointers
[89.245s][info][gc,phases      ] GC(39) Phase 3: Adjust pointers 14.092ms
[89.245s][info][gc,phases,start] GC(39) Phase 4: Compact heap
[89.254s][info][gc,phases      ] GC(39) Phase 4: Compact heap 9.639ms
[89.255s][info][gc,heap        ] GC(39) Eden regions: 0->0(6)
[89.255s][info][gc,heap        ] GC(39) Survivor regions: 0->0(0)
[89.255s][info][gc,heap        ] GC(39) Old regions: 121->121
[89.255s][info][gc,heap        ] GC(39) Archive regions: 0->0
[89.255s][info][gc,heap        ] GC(39) Humongous regions: 7->7
[89.255s][info][gc,metaspace   ] GC(39) Metaspace: 2431K->2431K(1056768K)
[89.255s][info][gc             ] GC(39) Pause Full (G1 Evacuation Pause) 127M->127M(128M) 75.502ms
[89.255s][info][gc,cpu         ] GC(39) User=0.19s Sys=0.00s Real=0.08s
[89.255s][info][gc,marking     ] GC(38) Concurrent Mark From Roots 157.435ms
[89.255s][info][gc,start       ] GC(40) Pause Young (Normal) (G1 Evacuation Pause)
[89.255s][info][gc,task        ] GC(40) Using 3 workers of 8 for evacuation
[89.256s][info][gc,phases      ] GC(40)   Pre Evacuate Collection Set: 0.0ms
[89.256s][info][gc,phases      ] GC(40)   Evacuate Collection Set: 0.1ms
[89.256s][info][gc,phases      ] GC(40)   Post Evacuate Collection Set: 0.2ms
[89.256s][info][gc,phases      ] GC(40)   Other: 0.1ms
[89.256s][info][gc,heap        ] GC(40) Eden regions: 0->0(6)
[89.256s][info][gc,heap        ] GC(40) Survivor regions: 0->0(0)
[89.256s][info][gc,heap        ] GC(40) Old regions: 121->121
[89.256s][info][gc,heap        ] GC(40) Archive regions: 0->0
[89.256s][info][gc,heap        ] GC(40) Humongous regions: 7->7
[89.256s][info][gc,metaspace   ] GC(40) Metaspace: 2431K->2431K(1056768K)
[89.256s][info][gc             ] GC(40) Pause Young (Normal) (G1 Evacuation Pause) 127M->127M(128M) 0.511ms
[89.256s][info][gc,cpu         ] GC(40) User=0.00s Sys=0.00s Real=0.00s
[89.256s][info][gc,task        ] GC(41) Using 3 workers of 8 for full compaction
[89.256s][info][gc,start       ] GC(41) Pause Full (G1 Evacuation Pause)
[89.256s][info][gc,phases,start] GC(41) Phase 1: Mark live objects
[89.295s][info][gc,phases      ] GC(41) Phase 1: Mark live objects 38.825ms
[89.295s][info][gc,phases,start] GC(41) Phase 2: Prepare for compaction
[89.306s][info][gc,phases      ] GC(41) Phase 2: Prepare for compaction 10.727ms
[89.306s][info][gc,phases,start] GC(41) Phase 3: Adjust pointers
[89.319s][info][gc,phases      ] GC(41) Phase 3: Adjust pointers 13.402ms
[89.319s][info][gc,phases,start] GC(41) Phase 4: Compact heap
[89.327s][info][gc,phases      ] GC(41) Phase 4: Compact heap 8.045ms
[89.327s][info][gc,heap        ] GC(41) Eden regions: 0->0(6)
[89.328s][info][gc,heap        ] GC(41) Survivor regions: 0->0(0)
[89.328s][info][gc,heap        ] GC(41) Old regions: 121->121
[89.328s][info][gc,heap        ] GC(41) Archive regions: 0->0
[89.328s][info][gc,heap        ] GC(41) Humongous regions: 7->7
[89.328s][info][gc,metaspace   ] GC(41) Metaspace: 2431K->2431K(1056768K)
[89.328s][info][gc             ] GC(41) Pause Full (G1 Evacuation Pause) 127M->127M(128M) 71.771ms
[89.328s][info][gc,cpu         ] GC(41) User=0.17s Sys=0.00s Real=0.07s
[89.328s][info][gc,task        ] GC(42) Using 3 workers of 8 for full compaction
[89.328s][info][gc,start       ] GC(42) Pause Full (G1 Evacuation Pause)
[89.328s][info][gc,phases,start] GC(42) Phase 1: Mark live objects
[89.363s][info][gc,phases      ] GC(42) Phase 1: Mark live objects 35.505ms
[89.364s][info][gc,phases,start] GC(42) Phase 2: Prepare for compaction
[89.375s][info][gc,phases      ] GC(42) Phase 2: Prepare for compaction 11.426ms
[89.375s][info][gc,phases,start] GC(42) Phase 3: Adjust pointers
[89.389s][info][gc,phases      ] GC(42) Phase 3: Adjust pointers 13.607ms
[89.389s][info][gc,phases,start] GC(42) Phase 4: Compact heap
[89.397s][info][gc,phases      ] GC(42) Phase 4: Compact heap 8.385ms
[89.398s][info][gc,heap        ] GC(42) Eden regions: 0->0(6)
[89.398s][info][gc,heap        ] GC(42) Survivor regions: 0->0(0)
[89.398s][info][gc,heap        ] GC(42) Old regions: 121->121
[89.398s][info][gc,heap        ] GC(42) Archive regions: 0->0
[89.398s][info][gc,heap        ] GC(42) Humongous regions: 7->7
[89.398s][info][gc,metaspace   ] GC(42) Metaspace: 2431K->2431K(1056768K)
[89.398s][info][gc             ] GC(42) Pause Full (G1 Evacuation Pause) 127M->127M(128M) 69.738ms
[89.398s][info][gc,cpu         ] GC(42) User=0.20s Sys=0.00s Real=0.07s
[89.398s][info][gc,marking     ] GC(38) Concurrent Mark Abort
[89.398s][info][gc             ] GC(38) Concurrent Cycle 300.525ms
[89.398s][info][gc,start       ] GC(43) Pause Young (Normal) (G1 Evacuation Pause)
[89.398s][info][gc,task        ] GC(43) Using 3 workers of 8 for evacuation
[89.399s][info][gc,phases      ] GC(43)   Pre Evacuate Collection Set: 0.0ms
[89.399s][info][gc,phases      ] GC(43)   Evacuate Collection Set: 0.1ms
[89.399s][info][gc,phases      ] GC(43)   Post Evacuate Collection Set: 0.4ms
[89.399s][info][gc,phases      ] GC(43)   Other: 0.1ms
[89.399s][info][gc,heap        ] GC(43) Eden regions: 0->0(6)
[89.399s][info][gc,heap        ] GC(43) Survivor regions: 0->0(0)
[89.399s][info][gc,heap        ] GC(43) Old regions: 121->121
[89.399s][info][gc,heap        ] GC(43) Archive regions: 0->0
[89.399s][info][gc,heap        ] GC(43) Humongous regions: 7->7
[89.399s][info][gc,metaspace   ] GC(43) Metaspace: 2431K->2431K(1056768K)
[89.399s][info][gc             ] GC(43) Pause Young (Normal) (G1 Evacuation Pause) 127M->127M(128M) 0.856ms
[89.399s][info][gc,cpu         ] GC(43) User=0.00s Sys=0.00s Real=0.00s
[89.399s][info][gc,task        ] GC(44) Using 3 workers of 8 for full compaction
[89.399s][info][gc,start       ] GC(44) Pause Full (G1 Evacuation Pause)
[89.399s][info][gc,phases,start] GC(44) Phase 1: Mark live objects
[89.440s][info][gc,phases      ] GC(44) Phase 1: Mark live objects 40.829ms
[89.440s][info][gc,phases,start] GC(44) Phase 2: Prepare for compaction
[89.451s][info][gc,phases      ] GC(44) Phase 2: Prepare for compaction 10.890ms
[89.451s][info][gc,phases,start] GC(44) Phase 3: Adjust pointers
[89.466s][info][gc,phases      ] GC(44) Phase 3: Adjust pointers 14.608ms
[89.466s][info][gc,phases,start] GC(44) Phase 4: Compact heap
[89.476s][info][gc,phases      ] GC(44) Phase 4: Compact heap 10.516ms
[89.477s][info][gc,heap        ] GC(44) Eden regions: 0->0(6)
[89.477s][info][gc,heap        ] GC(44) Survivor regions: 0->0(0)
[89.477s][info][gc,heap        ] GC(44) Old regions: 121->121
[89.477s][info][gc,heap        ] GC(44) Archive regions: 0->0
[89.477s][info][gc,heap        ] GC(44) Humongous regions: 7->7
[89.477s][info][gc,metaspace   ] GC(44) Metaspace: 2431K->2431K(1056768K)
[89.477s][info][gc             ] GC(44) Pause Full (G1 Evacuation Pause) 127M->127M(128M) 77.657ms
[89.477s][info][gc,cpu         ] GC(44) User=0.20s Sys=0.00s Real=0.08s
[89.477s][info][gc,task        ] GC(45) Using 3 workers of 8 for full compaction
[89.477s][info][gc,start       ] GC(45) Pause Full (G1 Evacuation Pause)
[89.477s][info][gc,phases,start] GC(45) Phase 1: Mark live objects
[89.513s][info][gc,phases      ] GC(45) Phase 1: Mark live objects 35.790ms
[89.513s][info][gc,phases,start] GC(45) Phase 2: Prepare for compaction
[89.524s][info][gc,phases      ] GC(45) Phase 2: Prepare for compaction 10.554ms
[89.524s][info][gc,phases,start] GC(45) Phase 3: Adjust pointers
[89.538s][info][gc,phases      ] GC(45) Phase 3: Adjust pointers 13.959ms
[89.538s][info][gc,phases,start] GC(45) Phase 4: Compact heap
[89.546s][info][gc,phases      ] GC(45) Phase 4: Compact heap 7.837ms
[89.546s][info][gc,heap        ] GC(45) Eden regions: 0->0(6)
[89.546s][info][gc,heap        ] GC(45) Survivor regions: 0->0(0)
[89.546s][info][gc,heap        ] GC(45) Old regions: 121->121
[89.546s][info][gc,heap        ] GC(45) Archive regions: 0->0
[89.546s][info][gc,heap        ] GC(45) Humongous regions: 7->7
[89.546s][info][gc,metaspace   ] GC(45) Metaspace: 2431K->2431K(1056768K)
[89.546s][info][gc             ] GC(45) Pause Full (G1 Evacuation Pause) 127M->127M(128M) 68.944ms
[89.546s][info][gc,cpu         ] GC(45) User=0.19s Sys=0.00s Real=0.07s
[89.547s][info][gc,start       ] GC(46) Pause Young (Concurrent Start) (G1 Evacuation Pause)
[89.547s][info][gc,task        ] GC(46) Using 3 workers of 8 for evacuation
[89.547s][info][gc,phases      ] GC(46)   Pre Evacuate Collection Set: 0.0ms
[89.547s][info][gc,phases      ] GC(46)   Evacuate Collection Set: 0.2ms
[89.547s][info][gc,phases      ] GC(46)   Post Evacuate Collection Set: 0.1ms
[89.547s][info][gc,phases      ] GC(46)   Other: 0.1ms
[89.547s][info][gc,heap        ] GC(46) Eden regions: 0->0(6)
[89.547s][info][gc,heap        ] GC(46) Survivor regions: 0->0(0)
[89.547s][info][gc,heap        ] GC(46) Old regions: 121->121
[89.547s][info][gc,heap        ] GC(46) Archive regions: 0->0
[89.547s][info][gc,heap        ] GC(46) Humongous regions: 7->7
[89.547s][info][gc,metaspace   ] GC(46) Metaspace: 2431K->2431K(1056768K)
[89.547s][info][gc             ] GC(46) Pause Young (Concurrent Start) (G1 Evacuation Pause) 127M->127M(128M) 0.542ms
[89.547s][info][gc,cpu         ] GC(46) User=0.00s Sys=0.00s Real=0.00s
[89.547s][info][gc,task        ] GC(47) Using 3 workers of 8 for full compaction
[89.547s][info][gc             ] GC(48) Concurrent Cycle
[89.547s][info][gc,marking     ] GC(48) Concurrent Clear Claimed Marks
[89.547s][info][gc,marking     ] GC(48) Concurrent Clear Claimed Marks 0.020ms
[89.547s][info][gc,start       ] GC(47) Pause Full (G1 Evacuation Pause)
[89.547s][info][gc,marking     ] GC(48) Concurrent Scan Root Regions
[89.547s][info][gc,marking     ] GC(48) Concurrent Scan Root Regions 0.060ms
[89.547s][info][gc,marking     ] GC(48) Concurrent Mark (89.547s)
[89.547s][info][gc,marking     ] GC(48) Concurrent Mark From Roots
[89.547s][info][gc,task        ] GC(48) Using 2 workers of 2 for marking
[89.547s][info][gc,phases,start] GC(47) Phase 1: Mark live objects
[89.549s][info][gc,phases      ] GC(47) Phase 1: Mark live objects 1.240ms
[89.549s][info][gc,phases,start] GC(47) Phase 2: Prepare for compaction
[89.549s][info][gc,phases      ] GC(47) Phase 2: Prepare for compaction 0.339ms
[89.549s][info][gc,phases,start] GC(47) Phase 3: Adjust pointers
[89.550s][info][gc,phases      ] GC(47) Phase 3: Adjust pointers 0.608ms
[89.550s][info][gc,phases,start] GC(47) Phase 4: Compact heap
[89.550s][info][gc,phases      ] GC(47) Phase 4: Compact heap 0.432ms
[89.551s][info][gc,heap        ] GC(47) Eden regions: 0->0(50)
[89.551s][info][gc,heap        ] GC(47) Survivor regions: 0->0(0)
[89.551s][info][gc,heap        ] GC(47) Old regions: 121->3
[89.551s][info][gc,heap        ] GC(47) Archive regions: 0->0
[89.551s][info][gc,heap        ] GC(47) Humongous regions: 7->0
[89.551s][info][gc,metaspace   ] GC(47) Metaspace: 2431K->2431K(1056768K)
[89.551s][info][gc             ] GC(47) Pause Full (G1 Evacuation Pause) 127M->1M(128M) 3.451ms
[89.551s][info][gc,cpu         ] GC(47) User=0.00s Sys=0.00s Real=0.00s
[89.551s][info][gc,marking     ] GC(48) Concurrent Mark From Roots 3.620ms
[89.551s][info][gc,marking     ] GC(48) Concurrent Mark Abort
[89.551s][info][gc             ] GC(48) Concurrent Cycle 3.873ms
[89.552s][info][gc,heap,exit   ] Heap
[89.553s][info][gc,heap,exit   ]  garbage-first heap   total 131072K, used 2731K [0x00000000f8000000, 0x0000000100000000)
[89.553s][info][gc,heap,exit   ]   region size 1024K, 2 young (2048K), 0 survivors (0K)
[89.553s][info][gc,heap,exit   ]  Metaspace       used 2459K, capacity 4749K, committed 4864K, reserved 1056768K
[89.553s][info][gc,heap,exit   ]   class space    used 266K, capacity 452K, committed 512K, reserved 1048576K
```

</details>
VMOptions: ```-Xmx128m -Xms128m -Xloggc:gc_g1.log -XX:+PrintGCDetails```

## SerialGC 

<details>
<summary>Trace:</summary>

```
[0.014s][info][gc] Using Serial
[0.014s][info][gc,heap,coops] Heap address: 0x00000000f8000000, size: 128 MB, Compressed Oops mode: 32-bit
[2.714s][info][gc,start     ] GC(0) Pause Young (Allocation Failure)
[2.738s][info][gc,heap      ] GC(0) DefNew: 34944K->4352K(39296K)
[2.738s][info][gc,heap      ] GC(0) Tenured: 0K->14380K(87424K)
[2.738s][info][gc,metaspace ] GC(0) Metaspace: 1662K->1662K(1056768K)
[2.738s][info][gc           ] GC(0) Pause Young (Allocation Failure) 34M->18M(123M) 23.769ms
[2.738s][info][gc,cpu       ] GC(0) User=0.03s Sys=0.00s Real=0.02s
[6.057s][info][gc,start     ] GC(1) Pause Young (Allocation Failure)
[6.097s][info][gc,heap      ] GC(1) DefNew: 39296K->4352K(39296K)
[6.097s][info][gc,heap      ] GC(1) Tenured: 14380K->41257K(87424K)
[6.097s][info][gc,metaspace ] GC(1) Metaspace: 2422K->2422K(1056768K)
[6.097s][info][gc           ] GC(1) Pause Young (Allocation Failure) 52M->44M(123M) 40.089ms
[6.097s][info][gc,cpu       ] GC(1) User=0.05s Sys=0.00s Real=0.04s
[19.319s][info][gc,start     ] GC(2) Pause Young (Allocation Failure)
[19.353s][info][gc,heap      ] GC(2) DefNew: 39296K->4351K(39296K)
[19.353s][info][gc,heap      ] GC(2) Tenured: 41257K->67070K(87424K)
[19.353s][info][gc,metaspace ] GC(2) Metaspace: 2428K->2428K(1056768K)
[19.353s][info][gc           ] GC(2) Pause Young (Allocation Failure) 78M->69M(123M) 34.015ms
[19.354s][info][gc,cpu       ] GC(2) User=0.02s Sys=0.02s Real=0.03s
[19.372s][info][gc,start     ] GC(3) Pause Young (Allocation Failure)
[19.372s][info][gc           ] GC(3) Pause Young (Allocation Failure) 103M->103M(123M) 0.099ms
[19.372s][info][gc,cpu       ] GC(3) User=0.00s Sys=0.00s Real=0.00s
[19.372s][info][gc,start     ] GC(4) Pause Full (Allocation Failure)
[19.372s][info][gc,phases,start] GC(4) Phase 1: Mark live objects
[19.400s][info][gc,phases      ] GC(4) Phase 1: Mark live objects 28.164ms
[19.400s][info][gc,phases,start] GC(4) Phase 2: Compute new object addresses
[19.426s][info][gc,phases      ] GC(4) Phase 2: Compute new object addresses 26.316ms
[19.426s][info][gc,phases,start] GC(4) Phase 3: Adjust pointers
[19.453s][info][gc,phases      ] GC(4) Phase 3: Adjust pointers 26.386ms
[19.453s][info][gc,phases,start] GC(4) Phase 4: Move objects
[19.480s][info][gc,phases      ] GC(4) Phase 4: Move objects 26.651ms
[19.480s][info][gc,heap        ] GC(4) DefNew: 39295K->0K(39296K)
[19.480s][info][gc,heap        ] GC(4) Tenured: 67070K->84171K(87424K)
[19.480s][info][gc,metaspace   ] GC(4) Metaspace: 2436K->2436K(1056768K)
[19.480s][info][gc             ] GC(4) Pause Full (Allocation Failure) 103M->82M(123M) 107.949ms
[19.480s][info][gc,cpu         ] GC(4) User=0.11s Sys=0.00s Real=0.11s
[80.436s][info][gc,start       ] GC(5) Pause Young (Allocation Failure)
[80.436s][info][gc             ] GC(5) Pause Young (Allocation Failure) 116M->116M(123M) 0.100ms
[80.436s][info][gc,cpu         ] GC(5) User=0.00s Sys=0.00s Real=0.00s
[80.436s][info][gc,start       ] GC(6) Pause Full (Allocation Failure)
[80.436s][info][gc,phases,start] GC(6) Phase 1: Mark live objects
[80.465s][info][gc,phases      ] GC(6) Phase 1: Mark live objects 28.678ms
[80.465s][info][gc,phases,start] GC(6) Phase 2: Compute new object addresses
[80.490s][info][gc,phases      ] GC(6) Phase 2: Compute new object addresses 24.995ms
[80.490s][info][gc,phases,start] GC(6) Phase 3: Adjust pointers
[80.517s][info][gc,phases      ] GC(6) Phase 3: Adjust pointers 26.325ms
[80.517s][info][gc,phases,start] GC(6) Phase 4: Move objects
[80.541s][info][gc,phases      ] GC(6) Phase 4: Move objects 24.227ms
[80.541s][info][gc,heap        ] GC(6) DefNew: 34944K->0K(39296K)
[80.541s][info][gc,heap        ] GC(6) Tenured: 84171K->67884K(87424K)
[80.541s][info][gc,metaspace   ] GC(6) Metaspace: 2441K->2441K(1056768K)
[80.541s][info][gc             ] GC(6) Pause Full (Allocation Failure) 116M->66M(123M) 104.721ms
[80.541s][info][gc,cpu         ] GC(6) User=0.11s Sys=0.00s Real=0.10s
[80.562s][info][gc,start       ] GC(7) Pause Young (Allocation Failure)
[80.562s][info][gc             ] GC(7) Pause Young (Allocation Failure) 100M->100M(123M) 0.097ms
[80.562s][info][gc,cpu         ] GC(7) User=0.00s Sys=0.00s Real=0.00s
[80.562s][info][gc,start       ] GC(8) Pause Full (Allocation Failure)
[80.562s][info][gc,phases,start] GC(8) Phase 1: Mark live objects
[80.597s][info][gc,phases      ] GC(8) Phase 1: Mark live objects 34.429ms
[80.597s][info][gc,phases,start] GC(8) Phase 2: Compute new object addresses
[80.627s][info][gc,phases      ] GC(8) Phase 2: Compute new object addresses 29.881ms
[80.627s][info][gc,phases,start] GC(8) Phase 3: Adjust pointers
[80.656s][info][gc,phases      ] GC(8) Phase 3: Adjust pointers 29.570ms
[80.656s][info][gc,phases,start] GC(8) Phase 4: Move objects
[80.679s][info][gc,phases      ] GC(8) Phase 4: Move objects 22.954ms
[80.680s][info][gc,heap        ] GC(8) DefNew: 34944K->15015K(39296K)
[80.680s][info][gc,heap        ] GC(8) Tenured: 67884K->87423K(87424K)
[80.680s][info][gc,metaspace   ] GC(8) Metaspace: 2444K->2398K(1056768K)
[80.680s][info][gc             ] GC(8) Pause Full (Allocation Failure) 100M->100M(123M) 117.281ms
[80.680s][info][gc,cpu         ] GC(8) User=0.13s Sys=0.00s Real=0.12s
[80.713s][info][gc,start       ] GC(9) Pause Full (Allocation Failure)
[80.713s][info][gc,phases,start] GC(9) Phase 1: Mark live objects
[80.768s][info][gc,phases      ] GC(9) Phase 1: Mark live objects 55.053ms
[80.768s][info][gc,phases,start] GC(9) Phase 2: Compute new object addresses
[80.807s][info][gc,phases      ] GC(9) Phase 2: Compute new object addresses 38.849ms
[80.807s][info][gc,phases,start] GC(9) Phase 3: Adjust pointers
[80.842s][info][gc,phases      ] GC(9) Phase 3: Adjust pointers 35.687ms
[80.842s][info][gc,phases,start] GC(9) Phase 4: Move objects
[80.872s][info][gc,phases      ] GC(9) Phase 4: Move objects 29.580ms
[80.872s][info][gc,heap        ] GC(9) DefNew: 39295K->34748K(39296K)
[80.872s][info][gc,heap        ] GC(9) Tenured: 87423K->87423K(87424K)
[80.872s][info][gc,metaspace   ] GC(9) Metaspace: 2402K->2402K(1056768K)
[80.872s][info][gc             ] GC(9) Pause Full (Allocation Failure) 123M->119M(123M) 159.683ms
[80.872s][info][gc,cpu         ] GC(9) User=0.16s Sys=0.00s Real=0.16s
[80.893s][info][gc,start       ] GC(10) Pause Full (Allocation Failure)
[80.893s][info][gc,phases,start] GC(10) Phase 1: Mark live objects
[80.938s][info][gc,phases      ] GC(10) Phase 1: Mark live objects 45.072ms
[80.938s][info][gc,phases,start] GC(10) Phase 2: Compute new object addresses
[80.970s][info][gc,phases      ] GC(10) Phase 2: Compute new object addresses 31.581ms
[80.970s][info][gc,phases,start] GC(10) Phase 3: Adjust pointers
[81.003s][info][gc,phases      ] GC(10) Phase 3: Adjust pointers 32.799ms
[81.003s][info][gc,phases,start] GC(10) Phase 4: Move objects
[81.004s][info][gc,phases      ] GC(10) Phase 4: Move objects 0.977ms
[81.004s][info][gc,heap        ] GC(10) DefNew: 39295K->39253K(39296K)
[81.004s][info][gc,heap        ] GC(10) Tenured: 87423K->87423K(87424K)
[81.004s][info][gc,metaspace   ] GC(10) Metaspace: 2402K->2402K(1056768K)
[81.004s][info][gc             ] GC(10) Pause Full (Allocation Failure) 123M->123M(123M) 110.852ms
[81.004s][info][gc,cpu         ] GC(10) User=0.11s Sys=0.00s Real=0.11s
[81.004s][info][gc,start       ] GC(11) Pause Full (Allocation Failure)
[81.005s][info][gc,phases,start] GC(11) Phase 1: Mark live objects
[81.046s][info][gc,phases      ] GC(11) Phase 1: Mark live objects 41.691ms
[81.046s][info][gc,phases,start] GC(11) Phase 2: Compute new object addresses
[81.077s][info][gc,phases      ] GC(11) Phase 2: Compute new object addresses 31.136ms
[81.077s][info][gc,phases,start] GC(11) Phase 3: Adjust pointers
[81.111s][info][gc,phases      ] GC(11) Phase 3: Adjust pointers 33.536ms
[81.111s][info][gc,phases,start] GC(11) Phase 4: Move objects
[81.111s][info][gc,phases      ] GC(11) Phase 4: Move objects 0.025ms
[81.111s][info][gc,heap        ] GC(11) DefNew: 39295K->39294K(39296K)
[81.111s][info][gc,heap        ] GC(11) Tenured: 87423K->87423K(87424K)
[81.111s][info][gc,metaspace   ] GC(11) Metaspace: 2402K->2402K(1056768K)
[81.111s][info][gc             ] GC(11) Pause Full (Allocation Failure) 123M->123M(123M) 106.836ms
[81.111s][info][gc,cpu         ] GC(11) User=0.11s Sys=0.00s Real=0.11s
[81.111s][info][gc,start       ] GC(12) Pause Full (Allocation Failure)
[81.112s][info][gc,phases,start] GC(12) Phase 1: Mark live objects
[81.155s][info][gc,phases      ] GC(12) Phase 1: Mark live objects 43.621ms
[81.155s][info][gc,phases,start] GC(12) Phase 2: Compute new object addresses
[81.184s][info][gc,phases      ] GC(12) Phase 2: Compute new object addresses 28.628ms
[81.184s][info][gc,phases,start] GC(12) Phase 3: Adjust pointers
[81.216s][info][gc,phases      ] GC(12) Phase 3: Adjust pointers 32.230ms
[81.216s][info][gc,phases,start] GC(12) Phase 4: Move objects
[81.216s][info][gc,phases      ] GC(12) Phase 4: Move objects 0.018ms
[81.216s][info][gc,heap        ] GC(12) DefNew: 39295K->39295K(39296K)
[81.216s][info][gc,heap        ] GC(12) Tenured: 87423K->87423K(87424K)
[81.216s][info][gc,metaspace   ] GC(12) Metaspace: 2402K->2402K(1056768K)
[81.216s][info][gc             ] GC(12) Pause Full (Allocation Failure) 123M->123M(123M) 104.930ms
[81.216s][info][gc,cpu         ] GC(12) User=0.09s Sys=0.00s Real=0.10s
[81.216s][info][gc,start       ] GC(13) Pause Full (Allocation Failure)
[81.217s][info][gc,phases,start] GC(13) Phase 1: Mark live objects
[81.258s][info][gc,phases      ] GC(13) Phase 1: Mark live objects 41.542ms
[81.258s][info][gc,phases,start] GC(13) Phase 2: Compute new object addresses
[81.290s][info][gc,phases      ] GC(13) Phase 2: Compute new object addresses 31.953ms
[81.290s][info][gc,phases,start] GC(13) Phase 3: Adjust pointers
[81.328s][info][gc,phases      ] GC(13) Phase 3: Adjust pointers 38.123ms
[81.328s][info][gc,phases,start] GC(13) Phase 4: Move objects
[81.353s][info][gc,phases      ] GC(13) Phase 4: Move objects 24.215ms
[81.353s][info][gc,heap        ] GC(13) DefNew: 39295K->39292K(39296K)
[81.353s][info][gc,heap        ] GC(13) Tenured: 87423K->87423K(87424K)
[81.353s][info][gc,metaspace   ] GC(13) Metaspace: 2402K->2402K(1056768K)
[81.353s][info][gc             ] GC(13) Pause Full (Allocation Failure) 123M->123M(123M) 136.263ms
[81.353s][info][gc,cpu         ] GC(13) User=0.14s Sys=0.00s Real=0.14s
[81.353s][info][gc,start       ] GC(14) Pause Full (Allocation Failure)
[81.353s][info][gc,phases,start] GC(14) Phase 1: Mark live objects
[81.394s][info][gc,phases      ] GC(14) Phase 1: Mark live objects 41.290ms
[81.394s][info][gc,phases,start] GC(14) Phase 2: Compute new object addresses
[81.424s][info][gc,phases      ] GC(14) Phase 2: Compute new object addresses 29.708ms
[81.424s][info][gc,phases,start] GC(14) Phase 3: Adjust pointers
[81.456s][info][gc,phases      ] GC(14) Phase 3: Adjust pointers 32.057ms
[81.456s][info][gc,phases,start] GC(14) Phase 4: Move objects
[81.456s][info][gc,phases      ] GC(14) Phase 4: Move objects 0.032ms
[81.456s][info][gc,heap        ] GC(14) DefNew: 39295K->39295K(39296K)
[81.456s][info][gc,heap        ] GC(14) Tenured: 87423K->87423K(87424K)
[81.456s][info][gc,metaspace   ] GC(14) Metaspace: 2402K->2402K(1056768K)
[81.456s][info][gc             ] GC(14) Pause Full (Allocation Failure) 123M->123M(123M) 103.566ms
[81.456s][info][gc,cpu         ] GC(14) User=0.11s Sys=0.00s Real=0.10s
[81.457s][info][gc,start       ] GC(15) Pause Full (Allocation Failure)
[81.457s][info][gc,phases,start] GC(15) Phase 1: Mark live objects
[81.497s][info][gc,phases      ] GC(15) Phase 1: Mark live objects 40.365ms
[81.497s][info][gc,phases,start] GC(15) Phase 2: Compute new object addresses
[81.531s][info][gc,phases      ] GC(15) Phase 2: Compute new object addresses 33.863ms
[81.531s][info][gc,phases,start] GC(15) Phase 3: Adjust pointers
[81.565s][info][gc,phases      ] GC(15) Phase 3: Adjust pointers 33.671ms
[81.565s][info][gc,phases,start] GC(15) Phase 4: Move objects
[81.565s][info][gc,phases      ] GC(15) Phase 4: Move objects 0.019ms
[81.565s][info][gc,heap        ] GC(15) DefNew: 39295K->39295K(39296K)
[81.565s][info][gc,heap        ] GC(15) Tenured: 87423K->87423K(87424K)
[81.565s][info][gc,metaspace   ] GC(15) Metaspace: 2402K->2402K(1056768K)
[81.565s][info][gc             ] GC(15) Pause Full (Allocation Failure) 123M->123M(123M) 108.317ms
[81.565s][info][gc,cpu         ] GC(15) User=0.11s Sys=0.00s Real=0.11s
[81.565s][info][gc,start       ] GC(16) Pause Full (Allocation Failure)
[81.565s][info][gc,phases,start] GC(16) Phase 1: Mark live objects
[81.608s][info][gc,phases      ] GC(16) Phase 1: Mark live objects 42.813ms
[81.608s][info][gc,phases,start] GC(16) Phase 2: Compute new object addresses
[81.638s][info][gc,phases      ] GC(16) Phase 2: Compute new object addresses 29.711ms
[81.638s][info][gc,phases,start] GC(16) Phase 3: Adjust pointers
[81.670s][info][gc,phases      ] GC(16) Phase 3: Adjust pointers 32.225ms
[81.670s][info][gc,phases,start] GC(16) Phase 4: Move objects
[81.670s][info][gc,phases      ] GC(16) Phase 4: Move objects 0.019ms
[81.670s][info][gc,heap        ] GC(16) DefNew: 39295K->39295K(39296K)
[81.670s][info][gc,heap        ] GC(16) Tenured: 87423K->87423K(87424K)
[81.670s][info][gc,metaspace   ] GC(16) Metaspace: 2402K->2402K(1056768K)
[81.670s][info][gc             ] GC(16) Pause Full (Allocation Failure) 123M->123M(123M) 105.151ms
[81.670s][info][gc,cpu         ] GC(16) User=0.09s Sys=0.00s Real=0.11s
[81.670s][info][gc,start       ] GC(17) Pause Full (Allocation Failure)
[81.670s][info][gc,phases,start] GC(17) Phase 1: Mark live objects
[81.712s][info][gc,phases      ] GC(17) Phase 1: Mark live objects 41.185ms
[81.712s][info][gc,phases,start] GC(17) Phase 2: Compute new object addresses
[81.747s][info][gc,phases      ] GC(17) Phase 2: Compute new object addresses 34.953ms
[81.747s][info][gc,phases,start] GC(17) Phase 3: Adjust pointers
[81.781s][info][gc,phases      ] GC(17) Phase 3: Adjust pointers 34.801ms
[81.781s][info][gc,phases,start] GC(17) Phase 4: Move objects
[81.813s][info][gc,phases      ] GC(17) Phase 4: Move objects 31.599ms
[81.813s][info][gc,heap        ] GC(17) DefNew: 39295K->39294K(39296K)
[81.813s][info][gc,heap        ] GC(17) Tenured: 87423K->87423K(87424K)
[81.813s][info][gc,metaspace   ] GC(17) Metaspace: 2402K->2402K(1056768K)
[81.813s][info][gc             ] GC(17) Pause Full (Allocation Failure) 123M->123M(123M) 143.095ms
[81.813s][info][gc,cpu         ] GC(17) User=0.16s Sys=0.00s Real=0.14s
[81.814s][info][gc,start       ] GC(18) Pause Full (Allocation Failure)
[81.814s][info][gc,phases,start] GC(18) Phase 1: Mark live objects
[81.816s][info][gc,phases      ] GC(18) Phase 1: Mark live objects 1.749ms
[81.816s][info][gc,phases,start] GC(18) Phase 2: Compute new object addresses
[81.839s][info][gc,phases      ] GC(18) Phase 2: Compute new object addresses 23.174ms
[81.839s][info][gc,phases,start] GC(18) Phase 3: Adjust pointers
[81.840s][info][gc,phases      ] GC(18) Phase 3: Adjust pointers 1.155ms
[81.840s][info][gc,phases,start] GC(18) Phase 4: Move objects
[81.840s][info][gc,phases      ] GC(18) Phase 4: Move objects 0.047ms
[81.840s][info][gc,heap        ] GC(18) DefNew: 39295K->0K(39296K)
[81.840s][info][gc,heap        ] GC(18) Tenured: 87423K->5428K(87424K)
[81.840s][info][gc,metaspace   ] GC(18) Metaspace: 2406K->2406K(1056768K)
[81.840s][info][gc             ] GC(18) Pause Full (Allocation Failure) 123M->5M(123M) 26.477ms
[81.840s][info][gc,cpu         ] GC(18) User=0.02s Sys=0.00s Real=0.03s
[81.842s][info][gc,heap,exit   ] Heap
[81.842s][info][gc,heap,exit   ]  def new generation   total 39296K, used 693K [0x00000000f8000000, 0x00000000faaa0000, 0x00000000faaa0000)
[81.842s][info][gc,heap,exit   ]   eden space 34944K,   1% used [0x00000000f8000000, 0x00000000f80ad740, 0x00000000fa220000)
[81.842s][info][gc,heap,exit   ]   from space 4352K,   0% used [0x00000000fa660000, 0x00000000fa660000, 0x00000000faaa0000)
[81.842s][info][gc,heap,exit   ]   to   space 4352K,   0% used [0x00000000fa220000, 0x00000000fa220000, 0x00000000fa660000)
[81.842s][info][gc,heap,exit   ]  tenured generation   total 87424K, used 5428K [0x00000000faaa0000, 0x0000000100000000, 0x0000000100000000)
[81.842s][info][gc,heap,exit   ]    the space 87424K,   6% used [0x00000000faaa0000, 0x00000000fafed330, 0x00000000fafed400, 0x0000000100000000)
[81.842s][info][gc,heap,exit   ]  Metaspace       used 2415K, capacity 4745K, committed 4864K, reserved 1056768K
[81.842s][info][gc,heap,exit   ]   class space    used 266K, capacity 452K, committed 512K, reserved 1048576K
```

</details>
VMOptions: ```-Xmx128m -Xms128m -Xloggc:gc_serial.log -XX:+UseSerialGC -XX:+PrintGCDetails```

## ParallelGC

<details>
<summary>Trace:</summary>

```
[0.014s][info][gc] Using Parallel
[0.014s][info][gc,heap,coops] Heap address: 0x00000000f8000000, size: 128 MB, Compressed Oops mode: 32-bit
[2.722s][info][gc,start     ] GC(0) Pause Young (Allocation Failure)
[2.742s][info][gc,heap      ] GC(0) PSYoungGen: 33280K->5113K(38400K)
[2.742s][info][gc,heap      ] GC(0) ParOldGen: 0K->12152K(87552K)
[2.742s][info][gc,metaspace ] GC(0) Metaspace: 1662K->1662K(1056768K)
[2.742s][info][gc           ] GC(0) Pause Young (Allocation Failure) 32M->16M(123M) 20.885ms
[2.743s][info][gc,cpu       ] GC(0) User=0.02s Sys=0.02s Real=0.02s
[6.097s][info][gc,start     ] GC(1) Pause Young (Allocation Failure)
[6.135s][info][gc,heap      ] GC(1) PSYoungGen: 38393K->5101K(38400K)
[6.135s][info][gc,heap      ] GC(1) ParOldGen: 12152K->36904K(87552K)
[6.135s][info][gc,metaspace ] GC(1) Metaspace: 2419K->2419K(1056768K)
[6.135s][info][gc           ] GC(1) Pause Young (Allocation Failure) 49M->41M(123M) 38.071ms
[6.135s][info][gc,cpu       ] GC(1) User=0.05s Sys=0.02s Real=0.04s
[19.941s][info][gc,start     ] GC(2) Pause Young (Allocation Failure)
[19.970s][info][gc,heap      ] GC(2) PSYoungGen: 38381K->5116K(38400K)
[19.970s][info][gc,heap      ] GC(2) ParOldGen: 36904K->60100K(87552K)
[19.970s][info][gc,metaspace ] GC(2) Metaspace: 2426K->2426K(1056768K)
[19.970s][info][gc           ] GC(2) Pause Young (Allocation Failure) 73M->63M(123M) 28.894ms
[19.970s][info][gc,cpu       ] GC(2) User=0.05s Sys=0.00s Real=0.03s
[19.970s][info][gc,start     ] GC(3) Pause Full (Ergonomics)
[19.970s][info][gc,phases,start] GC(3) Marking Phase
[20.022s][info][gc,phases      ] GC(3) Marking Phase 51.316ms
[20.022s][info][gc,phases,start] GC(3) Summary Phase
[20.022s][info][gc,phases      ] GC(3) Summary Phase 0.018ms
[20.022s][info][gc,phases,start] GC(3) Adjust Roots
[20.023s][info][gc,phases      ] GC(3) Adjust Roots 1.256ms
[20.023s][info][gc,phases,start] GC(3) Compaction Phase
[20.067s][info][gc,phases      ] GC(3) Compaction Phase 43.769ms
[20.067s][info][gc,phases,start] GC(3) Post Compact
[20.067s][info][gc,phases      ] GC(3) Post Compact 0.149ms
[20.067s][info][gc,heap        ] GC(3) PSYoungGen: 5116K->0K(38400K)
[20.067s][info][gc,heap        ] GC(3) ParOldGen: 60100K->43444K(87552K)
[20.067s][info][gc,metaspace   ] GC(3) Metaspace: 2426K->2426K(1056768K)
[20.067s][info][gc             ] GC(3) Pause Full (Ergonomics) 63M->42M(123M) 96.823ms
[20.067s][info][gc,cpu         ] GC(3) User=0.16s Sys=0.00s Real=0.10s
[20.085s][info][gc,start       ] GC(4) Pause Young (Allocation Failure)
[20.125s][info][gc,heap        ] GC(4) PSYoungGen: 33280K->5100K(38400K)
[20.125s][info][gc,heap        ] GC(4) ParOldGen: 43444K->71364K(87552K)
[20.125s][info][gc,metaspace   ] GC(4) Metaspace: 2439K->2439K(1056768K)
[20.125s][info][gc             ] GC(4) Pause Young (Allocation Failure) 74M->74M(123M) 39.415ms
[20.125s][info][gc,cpu         ] GC(4) User=0.06s Sys=0.00s Real=0.04s
[20.125s][info][gc,start       ] GC(5) Pause Full (Ergonomics)
[20.125s][info][gc,phases,start] GC(5) Marking Phase
[20.213s][info][gc,phases      ] GC(5) Marking Phase 88.399ms
[20.213s][info][gc,phases,start] GC(5) Summary Phase
[20.213s][info][gc,phases      ] GC(5) Summary Phase 0.018ms
[20.213s][info][gc,phases,start] GC(5) Adjust Roots
[20.214s][info][gc,phases      ] GC(5) Adjust Roots 0.552ms
[20.214s][info][gc,phases,start] GC(5) Compaction Phase
[20.260s][info][gc,phases      ] GC(5) Compaction Phase 45.809ms
[20.260s][info][gc,phases,start] GC(5) Post Compact
[20.260s][info][gc,phases      ] GC(5) Post Compact 0.118ms
[20.260s][info][gc,heap        ] GC(5) PSYoungGen: 5100K->0K(38400K)
[20.260s][info][gc,heap        ] GC(5) ParOldGen: 71364K->73098K(87552K)
[20.260s][info][gc,metaspace   ] GC(5) Metaspace: 2439K->2439K(1056768K)
[20.260s][info][gc             ] GC(5) Pause Full (Ergonomics) 74M->71M(123M) 135.201ms
[20.260s][info][gc,cpu         ] GC(5) User=0.27s Sys=0.00s Real=0.14s
[81.351s][info][gc,start       ] GC(6) Pause Full (Ergonomics)
[81.351s][info][gc,phases,start] GC(6) Marking Phase
[81.411s][info][gc,phases      ] GC(6) Marking Phase 59.987ms
[81.411s][info][gc,phases,start] GC(6) Summary Phase
[81.411s][info][gc,phases      ] GC(6) Summary Phase 0.018ms
[81.411s][info][gc,phases,start] GC(6) Adjust Roots
[81.413s][info][gc,phases      ] GC(6) Adjust Roots 1.308ms
[81.413s][info][gc,phases,start] GC(6) Compaction Phase
[81.470s][info][gc,phases      ] GC(6) Compaction Phase 57.202ms
[81.470s][info][gc,phases,start] GC(6) Post Compact
[81.470s][info][gc,phases      ] GC(6) Post Compact 0.194ms
[81.470s][info][gc,heap        ] GC(6) PSYoungGen: 33280K->0K(38400K)
[81.470s][info][gc,heap        ] GC(6) ParOldGen: 73098K->55242K(87552K)
[81.470s][info][gc,metaspace   ] GC(6) Metaspace: 2442K->2442K(1056768K)
[81.470s][info][gc             ] GC(6) Pause Full (Ergonomics) 103M->53M(123M) 119.034ms
[81.470s][info][gc,cpu         ] GC(6) User=0.22s Sys=0.00s Real=0.12s
[81.490s][info][gc,start       ] GC(7) Pause Full (Ergonomics)
[81.490s][info][gc,phases,start] GC(7) Marking Phase
[81.594s][info][gc,phases      ] GC(7) Marking Phase 103.840ms
[81.594s][info][gc,phases,start] GC(7) Summary Phase
[81.594s][info][gc,phases      ] GC(7) Summary Phase 0.018ms
[81.594s][info][gc,phases,start] GC(7) Adjust Roots
[81.596s][info][gc,phases      ] GC(7) Adjust Roots 1.144ms
[81.596s][info][gc,phases,start] GC(7) Compaction Phase
[81.644s][info][gc,phases      ] GC(7) Compaction Phase 47.955ms
[81.644s][info][gc,phases,start] GC(7) Post Compact
[81.644s][info][gc,phases      ] GC(7) Post Compact 0.229ms
[81.644s][info][gc,heap        ] GC(7) PSYoungGen: 33280K->1022K(38400K)
[81.644s][info][gc,heap        ] GC(7) ParOldGen: 55242K->87262K(87552K)
[81.644s][info][gc,metaspace   ] GC(7) Metaspace: 2444K->2397K(1056768K)
[81.644s][info][gc             ] GC(7) Pause Full (Ergonomics) 86M->86M(123M) 153.454ms
[81.644s][info][gc,cpu         ] GC(7) User=0.28s Sys=0.00s Real=0.15s
[81.663s][info][gc,start       ] GC(8) Pause Full (Ergonomics)
[81.664s][info][gc,phases,start] GC(8) Marking Phase
[81.808s][info][gc,phases      ] GC(8) Marking Phase 144.067ms
[81.808s][info][gc,phases,start] GC(8) Summary Phase
[81.808s][info][gc,phases      ] GC(8) Summary Phase 0.017ms
[81.808s][info][gc,phases,start] GC(8) Adjust Roots
[81.808s][info][gc,phases      ] GC(8) Adjust Roots 0.471ms
[81.808s][info][gc,phases,start] GC(8) Compaction Phase
[81.856s][info][gc,phases      ] GC(8) Compaction Phase 47.833ms
[81.856s][info][gc,phases,start] GC(8) Post Compact
[81.856s][info][gc,phases      ] GC(8) Post Compact 0.184ms
[81.856s][info][gc,heap        ] GC(8) PSYoungGen: 33280K->33099K(38400K)
[81.856s][info][gc,heap        ] GC(8) ParOldGen: 87262K->87262K(87552K)
[81.856s][info][gc,metaspace   ] GC(8) Metaspace: 2401K->2401K(1056768K)
[81.856s][info][gc             ] GC(8) Pause Full (Ergonomics) 117M->117M(123M) 192.872ms
[81.856s][info][gc,cpu         ] GC(8) User=0.38s Sys=0.00s Real=0.19s
[81.857s][info][gc,start       ] GC(9) Pause Full (Ergonomics)
[81.857s][info][gc,phases,start] GC(9) Marking Phase
[82.004s][info][gc,phases      ] GC(9) Marking Phase 147.183ms
[82.004s][info][gc,phases,start] GC(9) Summary Phase
[82.004s][info][gc,phases      ] GC(9) Summary Phase 0.017ms
[82.004s][info][gc,phases,start] GC(9) Adjust Roots
[82.005s][info][gc,phases      ] GC(9) Adjust Roots 0.652ms
[82.005s][info][gc,phases,start] GC(9) Compaction Phase
[82.035s][info][gc,phases      ] GC(9) Compaction Phase 29.839ms
[82.035s][info][gc,phases,start] GC(9) Post Compact
[82.035s][info][gc,phases      ] GC(9) Post Compact 0.219ms
[82.035s][info][gc,heap        ] GC(9) PSYoungGen: 33280K->33241K(38400K)
[82.035s][info][gc,heap        ] GC(9) ParOldGen: 87262K->87262K(87552K)
[82.035s][info][gc,metaspace   ] GC(9) Metaspace: 2401K->2401K(1056768K)
[82.035s][info][gc             ] GC(9) Pause Full (Ergonomics) 117M->117M(123M) 178.227ms
[82.035s][info][gc,cpu         ] GC(9) User=0.38s Sys=0.00s Real=0.18s
[82.035s][info][gc,start       ] GC(10) Pause Full (Ergonomics)
[82.035s][info][gc,phases,start] GC(10) Marking Phase
[82.184s][info][gc,phases      ] GC(10) Marking Phase 149.165ms
[82.185s][info][gc,phases,start] GC(10) Summary Phase
[82.185s][info][gc,phases      ] GC(10) Summary Phase 0.018ms
[82.185s][info][gc,phases,start] GC(10) Adjust Roots
[82.185s][info][gc,phases      ] GC(10) Adjust Roots 0.545ms
[82.185s][info][gc,phases,start] GC(10) Compaction Phase
[82.215s][info][gc,phases      ] GC(10) Compaction Phase 29.674ms
[82.215s][info][gc,phases,start] GC(10) Post Compact
[82.215s][info][gc,phases      ] GC(10) Post Compact 0.172ms
[82.215s][info][gc,heap        ] GC(10) PSYoungGen: 33280K->33253K(38400K)
[82.215s][info][gc,heap        ] GC(10) ParOldGen: 87262K->87262K(87552K)
[82.215s][info][gc,metaspace   ] GC(10) Metaspace: 2401K->2401K(1056768K)
[82.215s][info][gc             ] GC(10) Pause Full (Ergonomics) 117M->117M(123M) 179.875ms
[82.215s][info][gc,cpu         ] GC(10) User=0.34s Sys=0.00s Real=0.18s
[82.215s][info][gc,start       ] GC(11) Pause Full (Ergonomics)
[82.215s][info][gc,phases,start] GC(11) Marking Phase
[82.362s][info][gc,phases      ] GC(11) Marking Phase 146.379ms
[82.362s][info][gc,phases,start] GC(11) Summary Phase
[82.362s][info][gc,phases      ] GC(11) Summary Phase 0.064ms
[82.362s][info][gc,phases,start] GC(11) Adjust Roots
[82.363s][info][gc,phases      ] GC(11) Adjust Roots 0.611ms
[82.363s][info][gc,phases,start] GC(11) Compaction Phase
[82.393s][info][gc,phases      ] GC(11) Compaction Phase 30.004ms
[82.393s][info][gc,phases,start] GC(11) Post Compact
[82.393s][info][gc,phases      ] GC(11) Post Compact 0.206ms
[82.393s][info][gc,heap        ] GC(11) PSYoungGen: 33280K->33279K(38400K)
[82.393s][info][gc,heap        ] GC(11) ParOldGen: 87262K->87262K(87552K)
[82.393s][info][gc,metaspace   ] GC(11) Metaspace: 2401K->2401K(1056768K)
[82.393s][info][gc             ] GC(11) Pause Full (Ergonomics) 117M->117M(123M) 177.553ms
[82.393s][info][gc,cpu         ] GC(11) User=0.38s Sys=0.00s Real=0.18s
[82.393s][info][gc,start       ] GC(12) Pause Full (Ergonomics)
[82.393s][info][gc,phases,start] GC(12) Marking Phase
[82.537s][info][gc,phases      ] GC(12) Marking Phase 143.825ms
[82.537s][info][gc,phases,start] GC(12) Summary Phase
[82.537s][info][gc,phases      ] GC(12) Summary Phase 0.018ms
[82.537s][info][gc,phases,start] GC(12) Adjust Roots
[82.538s][info][gc,phases      ] GC(12) Adjust Roots 0.463ms
[82.538s][info][gc,phases,start] GC(12) Compaction Phase
[82.567s][info][gc,phases      ] GC(12) Compaction Phase 29.709ms
[82.567s][info][gc,phases,start] GC(12) Post Compact
[82.567s][info][gc,phases      ] GC(12) Post Compact 0.167ms
[82.568s][info][gc,heap        ] GC(12) PSYoungGen: 33280K->33279K(38400K)
[82.568s][info][gc,heap        ] GC(12) ParOldGen: 87262K->87262K(87552K)
[82.568s][info][gc,metaspace   ] GC(12) Metaspace: 2401K->2401K(1056768K)
[82.568s][info][gc             ] GC(12) Pause Full (Ergonomics) 117M->117M(123M) 174.450ms
[82.568s][info][gc,cpu         ] GC(12) User=0.34s Sys=0.00s Real=0.17s
[82.568s][info][gc,start       ] GC(13) Pause Full (Ergonomics)
[82.568s][info][gc,phases,start] GC(13) Marking Phase
[82.716s][info][gc,phases      ] GC(13) Marking Phase 148.513ms
[82.716s][info][gc,phases,start] GC(13) Summary Phase
[82.716s][info][gc,phases      ] GC(13) Summary Phase 0.018ms
[82.716s][info][gc,phases,start] GC(13) Adjust Roots
[82.717s][info][gc,phases      ] GC(13) Adjust Roots 0.415ms
[82.717s][info][gc,phases,start] GC(13) Compaction Phase
[82.745s][info][gc,phases      ] GC(13) Compaction Phase 27.670ms
[82.745s][info][gc,phases,start] GC(13) Post Compact
[82.745s][info][gc,phases      ] GC(13) Post Compact 0.186ms
[82.745s][info][gc,heap        ] GC(13) PSYoungGen: 33280K->33280K(38400K)
[82.745s][info][gc,heap        ] GC(13) ParOldGen: 87262K->87262K(87552K)
[82.745s][info][gc,metaspace   ] GC(13) Metaspace: 2401K->2401K(1056768K)
[82.745s][info][gc             ] GC(13) Pause Full (Ergonomics) 117M->117M(123M) 177.136ms
[82.745s][info][gc,cpu         ] GC(13) User=0.34s Sys=0.00s Real=0.18s
[82.745s][info][gc,start       ] GC(14) Pause Full (Ergonomics)
[82.745s][info][gc,phases,start] GC(14) Marking Phase
[82.889s][info][gc,phases      ] GC(14) Marking Phase 143.831ms
[82.889s][info][gc,phases,start] GC(14) Summary Phase
[82.889s][info][gc,phases      ] GC(14) Summary Phase 0.017ms
[82.889s][info][gc,phases,start] GC(14) Adjust Roots
[82.890s][info][gc,phases      ] GC(14) Adjust Roots 0.418ms
[82.890s][info][gc,phases,start] GC(14) Compaction Phase
[82.918s][info][gc,phases      ] GC(14) Compaction Phase 28.548ms
[82.918s][info][gc,phases,start] GC(14) Post Compact
[82.918s][info][gc,phases      ] GC(14) Post Compact 0.172ms
[82.918s][info][gc,heap        ] GC(14) PSYoungGen: 33280K->33280K(38400K)
[82.919s][info][gc,heap        ] GC(14) ParOldGen: 87264K->87264K(87552K)
[82.919s][info][gc,metaspace   ] GC(14) Metaspace: 2401K->2401K(1056768K)
[82.919s][info][gc             ] GC(14) Pause Full (Ergonomics) 117M->117M(123M) 173.273ms
[82.919s][info][gc,cpu         ] GC(14) User=0.34s Sys=0.00s Real=0.17s
[82.919s][info][gc,start       ] GC(15) Pause Full (Ergonomics)
[82.919s][info][gc,phases,start] GC(15) Marking Phase
[83.067s][info][gc,phases      ] GC(15) Marking Phase 148.525ms
[83.067s][info][gc,phases,start] GC(15) Summary Phase
[83.067s][info][gc,phases      ] GC(15) Summary Phase 0.018ms
[83.067s][info][gc,phases,start] GC(15) Adjust Roots
[83.068s][info][gc,phases      ] GC(15) Adjust Roots 0.477ms
[83.068s][info][gc,phases,start] GC(15) Compaction Phase
[83.098s][info][gc,phases      ] GC(15) Compaction Phase 29.977ms
[83.098s][info][gc,phases,start] GC(15) Post Compact
[83.098s][info][gc,phases      ] GC(15) Post Compact 0.234ms
[83.098s][info][gc,heap        ] GC(15) PSYoungGen: 33280K->33280K(38400K)
[83.098s][info][gc,heap        ] GC(15) ParOldGen: 87266K->87266K(87552K)
[83.098s][info][gc,metaspace   ] GC(15) Metaspace: 2401K->2401K(1056768K)
[83.098s][info][gc             ] GC(15) Pause Full (Ergonomics) 117M->117M(123M) 179.510ms
[83.098s][info][gc,cpu         ] GC(15) User=0.36s Sys=0.00s Real=0.18s
[83.099s][info][gc,start       ] GC(16) Pause Full (Ergonomics)
[83.099s][info][gc,phases,start] GC(16) Marking Phase
[83.246s][info][gc,phases      ] GC(16) Marking Phase 147.089ms
[83.246s][info][gc,phases,start] GC(16) Summary Phase
[83.246s][info][gc,phases      ] GC(16) Summary Phase 0.032ms
[83.246s][info][gc,phases,start] GC(16) Adjust Roots
[83.246s][info][gc,phases      ] GC(16) Adjust Roots 0.584ms
[83.246s][info][gc,phases,start] GC(16) Compaction Phase
[83.277s][info][gc,phases      ] GC(16) Compaction Phase 30.185ms
[83.277s][info][gc,phases,start] GC(16) Post Compact
[83.277s][info][gc,phases      ] GC(16) Post Compact 0.216ms
[83.277s][info][gc,heap        ] GC(16) PSYoungGen: 33280K->33280K(38400K)
[83.277s][info][gc,heap        ] GC(16) ParOldGen: 87269K->87269K(87552K)
[83.277s][info][gc,metaspace   ] GC(16) Metaspace: 2401K->2401K(1056768K)
[83.277s][info][gc             ] GC(16) Pause Full (Ergonomics) 117M->117M(123M) 178.448ms
[83.277s][info][gc,cpu         ] GC(16) User=0.34s Sys=0.00s Real=0.18s
[83.277s][info][gc,start       ] GC(17) Pause Full (Ergonomics)
[83.277s][info][gc,phases,start] GC(17) Marking Phase
[83.424s][info][gc,phases      ] GC(17) Marking Phase 146.208ms
[83.424s][info][gc,phases,start] GC(17) Summary Phase
[83.424s][info][gc,phases      ] GC(17) Summary Phase 0.017ms
[83.424s][info][gc,phases,start] GC(17) Adjust Roots
[83.424s][info][gc,phases      ] GC(17) Adjust Roots 0.432ms
[83.424s][info][gc,phases,start] GC(17) Compaction Phase
[83.453s][info][gc,phases      ] GC(17) Compaction Phase 29.126ms
[83.453s][info][gc,phases,start] GC(17) Post Compact
[83.453s][info][gc,phases      ] GC(17) Post Compact 0.172ms
[83.453s][info][gc,heap        ] GC(17) PSYoungGen: 33280K->33280K(38400K)
[83.453s][info][gc,heap        ] GC(17) ParOldGen: 87271K->87271K(87552K)
[83.453s][info][gc,metaspace   ] GC(17) Metaspace: 2401K->2401K(1056768K)
[83.453s][info][gc             ] GC(17) Pause Full (Ergonomics) 117M->117M(123M) 176.216ms
[83.454s][info][gc,cpu         ] GC(17) User=0.34s Sys=0.00s Real=0.18s
[83.454s][info][gc,start       ] GC(18) Pause Full (Ergonomics)
[83.454s][info][gc,phases,start] GC(18) Marking Phase
[83.603s][info][gc,phases      ] GC(18) Marking Phase 149.368ms
[83.603s][info][gc,phases,start] GC(18) Summary Phase
[83.603s][info][gc,phases      ] GC(18) Summary Phase 0.017ms
[83.603s][info][gc,phases,start] GC(18) Adjust Roots
[83.604s][info][gc,phases      ] GC(18) Adjust Roots 0.426ms
[83.604s][info][gc,phases,start] GC(18) Compaction Phase
[83.633s][info][gc,phases      ] GC(18) Compaction Phase 29.057ms
[83.633s][info][gc,phases,start] GC(18) Post Compact
[83.633s][info][gc,phases      ] GC(18) Post Compact 0.172ms
[83.633s][info][gc,heap        ] GC(18) PSYoungGen: 33280K->33280K(38400K)
[83.633s][info][gc,heap        ] GC(18) ParOldGen: 87273K->87273K(87552K)
[83.633s][info][gc,metaspace   ] GC(18) Metaspace: 2401K->2401K(1056768K)
[83.633s][info][gc             ] GC(18) Pause Full (Ergonomics) 117M->117M(123M) 179.359ms
[83.633s][info][gc,cpu         ] GC(18) User=0.36s Sys=0.02s Real=0.18s
[83.633s][info][gc,start       ] GC(19) Pause Full (Ergonomics)
[83.633s][info][gc,phases,start] GC(19) Marking Phase
[83.780s][info][gc,phases      ] GC(19) Marking Phase 146.361ms
[83.780s][info][gc,phases,start] GC(19) Summary Phase
[83.780s][info][gc,phases      ] GC(19) Summary Phase 0.018ms
[83.780s][info][gc,phases,start] GC(19) Adjust Roots
[83.780s][info][gc,phases      ] GC(19) Adjust Roots 0.446ms
[83.780s][info][gc,phases,start] GC(19) Compaction Phase
[83.809s][info][gc,phases      ] GC(19) Compaction Phase 28.979ms
[83.809s][info][gc,phases,start] GC(19) Post Compact
[83.809s][info][gc,phases      ] GC(19) Post Compact 0.171ms
[83.810s][info][gc,heap        ] GC(19) PSYoungGen: 33280K->33280K(38400K)
[83.810s][info][gc,heap        ] GC(19) ParOldGen: 87275K->87275K(87552K)
[83.810s][info][gc,metaspace   ] GC(19) Metaspace: 2401K->2401K(1056768K)
[83.810s][info][gc             ] GC(19) Pause Full (Ergonomics) 117M->117M(123M) 176.245ms
[83.810s][info][gc,cpu         ] GC(19) User=0.34s Sys=0.00s Real=0.18s
[83.810s][info][gc,start       ] GC(20) Pause Full (Ergonomics)
[83.810s][info][gc,phases,start] GC(20) Marking Phase
[83.958s][info][gc,phases      ] GC(20) Marking Phase 148.302ms
[83.958s][info][gc,phases,start] GC(20) Summary Phase
[83.958s][info][gc,phases      ] GC(20) Summary Phase 0.017ms
[83.958s][info][gc,phases,start] GC(20) Adjust Roots
[83.959s][info][gc,phases      ] GC(20) Adjust Roots 0.455ms
[83.959s][info][gc,phases,start] GC(20) Compaction Phase
[83.989s][info][gc,phases      ] GC(20) Compaction Phase 29.851ms
[83.989s][info][gc,phases,start] GC(20) Post Compact
[83.989s][info][gc,phases      ] GC(20) Post Compact 0.218ms
[83.989s][info][gc,heap        ] GC(20) PSYoungGen: 33280K->33280K(38400K)
[83.989s][info][gc,heap        ] GC(20) ParOldGen: 87278K->87278K(87552K)
[83.989s][info][gc,metaspace   ] GC(20) Metaspace: 2401K->2401K(1056768K)
[83.989s][info][gc             ] GC(20) Pause Full (Ergonomics) 117M->117M(123M) 179.132ms
[83.989s][info][gc,cpu         ] GC(20) User=0.38s Sys=0.00s Real=0.18s
[83.989s][info][gc,start       ] GC(21) Pause Full (Ergonomics)
[83.989s][info][gc,phases,start] GC(21) Marking Phase
[84.138s][info][gc,phases      ] GC(21) Marking Phase 148.489ms
[84.138s][info][gc,phases,start] GC(21) Summary Phase
[84.138s][info][gc,phases      ] GC(21) Summary Phase 0.019ms
[84.138s][info][gc,phases,start] GC(21) Adjust Roots
[84.138s][info][gc,phases      ] GC(21) Adjust Roots 0.490ms
[84.138s][info][gc,phases,start] GC(21) Compaction Phase
[84.168s][info][gc,phases      ] GC(21) Compaction Phase 29.273ms
[84.168s][info][gc,phases,start] GC(21) Post Compact
[84.168s][info][gc,phases      ] GC(21) Post Compact 0.176ms
[84.168s][info][gc,heap        ] GC(21) PSYoungGen: 33280K->33280K(38400K)
[84.168s][info][gc,heap        ] GC(21) ParOldGen: 87280K->87280K(87552K)
[84.168s][info][gc,metaspace   ] GC(21) Metaspace: 2401K->2401K(1056768K)
[84.168s][info][gc             ] GC(21) Pause Full (Ergonomics) 117M->117M(123M) 178.713ms
[84.168s][info][gc,cpu         ] GC(21) User=0.34s Sys=0.00s Real=0.18s
[84.168s][info][gc,start       ] GC(22) Pause Full (Ergonomics)
[84.168s][info][gc,phases,start] GC(22) Marking Phase
[84.313s][info][gc,phases      ] GC(22) Marking Phase 145.114ms
[84.313s][info][gc,phases,start] GC(22) Summary Phase
[84.313s][info][gc,phases      ] GC(22) Summary Phase 0.018ms
[84.313s][info][gc,phases,start] GC(22) Adjust Roots
[84.314s][info][gc,phases      ] GC(22) Adjust Roots 0.497ms
[84.314s][info][gc,phases,start] GC(22) Compaction Phase
[84.343s][info][gc,phases      ] GC(22) Compaction Phase 29.224ms
[84.343s][info][gc,phases,start] GC(22) Post Compact
[84.343s][info][gc,phases      ] GC(22) Post Compact 0.172ms
[84.343s][info][gc,heap        ] GC(22) PSYoungGen: 33280K->33280K(38400K)
[84.343s][info][gc,heap        ] GC(22) ParOldGen: 87282K->87282K(87552K)
[84.343s][info][gc,metaspace   ] GC(22) Metaspace: 2401K->2401K(1056768K)
[84.343s][info][gc             ] GC(22) Pause Full (Ergonomics) 117M->117M(123M) 175.278ms
[84.343s][info][gc,cpu         ] GC(22) User=0.33s Sys=0.00s Real=0.17s
[84.344s][info][gc,start       ] GC(23) Pause Full (Ergonomics)
[84.344s][info][gc,phases,start] GC(23) Marking Phase
[84.491s][info][gc,phases      ] GC(23) Marking Phase 147.529ms
[84.491s][info][gc,phases,start] GC(23) Summary Phase
[84.491s][info][gc,phases      ] GC(23) Summary Phase 0.017ms
[84.491s][info][gc,phases,start] GC(23) Adjust Roots
[84.492s][info][gc,phases      ] GC(23) Adjust Roots 0.522ms
[84.492s][info][gc,phases,start] GC(23) Compaction Phase
[84.522s][info][gc,phases      ] GC(23) Compaction Phase 29.689ms
[84.522s][info][gc,phases,start] GC(23) Post Compact
[84.522s][info][gc,phases      ] GC(23) Post Compact 0.242ms
[84.522s][info][gc,heap        ] GC(23) PSYoungGen: 33280K->33280K(38400K)
[84.522s][info][gc,heap        ] GC(23) ParOldGen: 87284K->87284K(87552K)
[84.522s][info][gc,metaspace   ] GC(23) Metaspace: 2401K->2401K(1056768K)
[84.522s][info][gc             ] GC(23) Pause Full (Ergonomics) 117M->117M(123M) 178.386ms
[84.522s][info][gc,cpu         ] GC(23) User=0.38s Sys=0.00s Real=0.18s
[84.522s][info][gc,start       ] GC(24) Pause Full (Ergonomics)
[84.523s][info][gc,phases,start] GC(24) Marking Phase
[84.669s][info][gc,phases      ] GC(24) Marking Phase 146.913ms
[84.670s][info][gc,phases,start] GC(24) Summary Phase
[84.670s][info][gc,phases      ] GC(24) Summary Phase 0.018ms
[84.670s][info][gc,phases,start] GC(24) Adjust Roots
[84.670s][info][gc,phases      ] GC(24) Adjust Roots 0.508ms
[84.670s][info][gc,phases,start] GC(24) Compaction Phase
[84.699s][info][gc,phases      ] GC(24) Compaction Phase 28.472ms
[84.699s][info][gc,phases,start] GC(24) Post Compact
[84.699s][info][gc,phases      ] GC(24) Post Compact 0.246ms
[84.699s][info][gc,heap        ] GC(24) PSYoungGen: 33280K->33280K(38400K)
[84.699s][info][gc,heap        ] GC(24) ParOldGen: 87287K->87287K(87552K)
[84.699s][info][gc,metaspace   ] GC(24) Metaspace: 2401K->2401K(1056768K)
[84.699s][info][gc             ] GC(24) Pause Full (Ergonomics) 117M->117M(123M) 176.510ms
[84.699s][info][gc,cpu         ] GC(24) User=0.34s Sys=0.00s Real=0.18s
[84.699s][info][gc,start       ] GC(25) Pause Full (Ergonomics)
[84.699s][info][gc,phases,start] GC(25) Marking Phase
[84.847s][info][gc,phases      ] GC(25) Marking Phase 147.284ms
[84.847s][info][gc,phases,start] GC(25) Summary Phase
[84.847s][info][gc,phases      ] GC(25) Summary Phase 0.018ms
[84.847s][info][gc,phases,start] GC(25) Adjust Roots
[84.848s][info][gc,phases      ] GC(25) Adjust Roots 0.741ms
[84.848s][info][gc,phases,start] GC(25) Compaction Phase
[84.876s][info][gc,phases      ] GC(25) Compaction Phase 28.327ms
[84.876s][info][gc,phases,start] GC(25) Post Compact
[84.876s][info][gc,phases      ] GC(25) Post Compact 0.171ms
[84.876s][info][gc,heap        ] GC(25) PSYoungGen: 33280K->33280K(38400K)
[84.876s][info][gc,heap        ] GC(25) ParOldGen: 87289K->87289K(87552K)
[84.876s][info][gc,metaspace   ] GC(25) Metaspace: 2401K->2401K(1056768K)
[84.876s][info][gc             ] GC(25) Pause Full (Ergonomics) 117M->117M(123M) 176.884ms
[84.876s][info][gc,cpu         ] GC(25) User=0.38s Sys=0.00s Real=0.18s
[84.876s][info][gc,start       ] GC(26) Pause Full (Ergonomics)
[84.877s][info][gc,phases,start] GC(26) Marking Phase
[85.029s][info][gc,phases      ] GC(26) Marking Phase 152.454ms
[85.029s][info][gc,phases,start] GC(26) Summary Phase
[85.029s][info][gc,phases      ] GC(26) Summary Phase 0.017ms
[85.029s][info][gc,phases,start] GC(26) Adjust Roots
[85.029s][info][gc,phases      ] GC(26) Adjust Roots 0.446ms
[85.030s][info][gc,phases,start] GC(26) Compaction Phase
[85.060s][info][gc,phases      ] GC(26) Compaction Phase 30.870ms
[85.060s][info][gc,phases,start] GC(26) Post Compact
[85.061s][info][gc,phases      ] GC(26) Post Compact 0.192ms
[85.061s][info][gc,heap        ] GC(26) PSYoungGen: 33280K->33280K(38400K)
[85.061s][info][gc,heap        ] GC(26) ParOldGen: 87291K->87291K(87552K)
[85.061s][info][gc,metaspace   ] GC(26) Metaspace: 2401K->2401K(1056768K)
[85.061s][info][gc             ] GC(26) Pause Full (Ergonomics) 117M->117M(123M) 184.277ms
[85.061s][info][gc,cpu         ] GC(26) User=0.34s Sys=0.00s Real=0.18s
[85.061s][info][gc,start       ] GC(27) Pause Full (Ergonomics)
[85.061s][info][gc,phases,start] GC(27) Marking Phase
[85.209s][info][gc,phases      ] GC(27) Marking Phase 147.580ms
[85.209s][info][gc,phases,start] GC(27) Summary Phase
[85.209s][info][gc,phases      ] GC(27) Summary Phase 0.018ms
[85.209s][info][gc,phases,start] GC(27) Adjust Roots
[85.209s][info][gc,phases      ] GC(27) Adjust Roots 0.468ms
[85.209s][info][gc,phases,start] GC(27) Compaction Phase
[85.238s][info][gc,phases      ] GC(27) Compaction Phase 28.840ms
[85.238s][info][gc,phases,start] GC(27) Post Compact
[85.238s][info][gc,phases      ] GC(27) Post Compact 0.170ms
[85.238s][info][gc,heap        ] GC(27) PSYoungGen: 33280K->33280K(38400K)
[85.238s][info][gc,heap        ] GC(27) ParOldGen: 87293K->87293K(87552K)
[85.238s][info][gc,metaspace   ] GC(27) Metaspace: 2401K->2401K(1056768K)
[85.238s][info][gc             ] GC(27) Pause Full (Ergonomics) 117M->117M(123M) 177.363ms
[85.238s][info][gc,cpu         ] GC(27) User=0.38s Sys=0.00s Real=0.18s
[85.239s][info][gc,start       ] GC(28) Pause Full (Ergonomics)
[85.239s][info][gc,phases,start] GC(28) Marking Phase
[85.387s][info][gc,phases      ] GC(28) Marking Phase 147.914ms
[85.387s][info][gc,phases,start] GC(28) Summary Phase
[85.387s][info][gc,phases      ] GC(28) Summary Phase 0.018ms
[85.387s][info][gc,phases,start] GC(28) Adjust Roots
[85.387s][info][gc,phases      ] GC(28) Adjust Roots 0.530ms
[85.387s][info][gc,phases,start] GC(28) Compaction Phase
[85.416s][info][gc,phases      ] GC(28) Compaction Phase 29.054ms
[85.416s][info][gc,phases,start] GC(28) Post Compact
[85.416s][info][gc,phases      ] GC(28) Post Compact 0.168ms
[85.417s][info][gc,heap        ] GC(28) PSYoungGen: 33280K->33280K(38400K)
[85.417s][info][gc,heap        ] GC(28) ParOldGen: 87295K->87295K(87552K)
[85.417s][info][gc,metaspace   ] GC(28) Metaspace: 2401K->2401K(1056768K)
[85.417s][info][gc             ] GC(28) Pause Full (Ergonomics) 117M->117M(123M) 177.984ms
[85.417s][info][gc,cpu         ] GC(28) User=0.34s Sys=0.00s Real=0.18s
[85.417s][info][gc,start       ] GC(29) Pause Full (Ergonomics)
[85.417s][info][gc,phases,start] GC(29) Marking Phase
[85.564s][info][gc,phases      ] GC(29) Marking Phase 146.724ms
[85.564s][info][gc,phases,start] GC(29) Summary Phase
[85.564s][info][gc,phases      ] GC(29) Summary Phase 0.018ms
[85.564s][info][gc,phases,start] GC(29) Adjust Roots
[85.564s][info][gc,phases      ] GC(29) Adjust Roots 0.429ms
[85.564s][info][gc,phases,start] GC(29) Compaction Phase
[85.592s][info][gc,phases      ] GC(29) Compaction Phase 28.105ms
[85.592s][info][gc,phases,start] GC(29) Post Compact
[85.593s][info][gc,phases      ] GC(29) Post Compact 0.171ms
[85.593s][info][gc,heap        ] GC(29) PSYoungGen: 33280K->33280K(38400K)
[85.593s][info][gc,heap        ] GC(29) ParOldGen: 87298K->87298K(87552K)
[85.593s][info][gc,metaspace   ] GC(29) Metaspace: 2401K->2401K(1056768K)
[85.593s][info][gc             ] GC(29) Pause Full (Ergonomics) 117M->117M(123M) 175.803ms
[85.593s][info][gc,cpu         ] GC(29) User=0.31s Sys=0.00s Real=0.18s
[85.593s][info][gc,start       ] GC(30) Pause Full (Ergonomics)
[85.593s][info][gc,phases,start] GC(30) Marking Phase
[85.741s][info][gc,phases      ] GC(30) Marking Phase 148.101ms
[85.741s][info][gc,phases,start] GC(30) Summary Phase
[85.741s][info][gc,phases      ] GC(30) Summary Phase 0.030ms
[85.741s][info][gc,phases,start] GC(30) Adjust Roots
[85.742s][info][gc,phases      ] GC(30) Adjust Roots 0.542ms
[85.742s][info][gc,phases,start] GC(30) Compaction Phase
[85.770s][info][gc,phases      ] GC(30) Compaction Phase 28.282ms
[85.770s][info][gc,phases,start] GC(30) Post Compact
[85.770s][info][gc,phases      ] GC(30) Post Compact 0.174ms
[85.770s][info][gc,heap        ] GC(30) PSYoungGen: 33280K->33280K(38400K)
[85.770s][info][gc,heap        ] GC(30) ParOldGen: 87300K->87300K(87552K)
[85.770s][info][gc,metaspace   ] GC(30) Metaspace: 2401K->2401K(1056768K)
[85.771s][info][gc             ] GC(30) Pause Full (Ergonomics) 117M->117M(123M) 177.425ms
[85.771s][info][gc,cpu         ] GC(30) User=0.38s Sys=0.00s Real=0.18s
[85.771s][info][gc,start       ] GC(31) Pause Full (Ergonomics)
[85.771s][info][gc,phases,start] GC(31) Marking Phase
[85.919s][info][gc,phases      ] GC(31) Marking Phase 148.102ms
[85.919s][info][gc,phases,start] GC(31) Summary Phase
[85.919s][info][gc,phases      ] GC(31) Summary Phase 0.051ms
[85.919s][info][gc,phases,start] GC(31) Adjust Roots
[85.919s][info][gc,phases      ] GC(31) Adjust Roots 0.469ms
[85.920s][info][gc,phases,start] GC(31) Compaction Phase
[85.948s][info][gc,phases      ] GC(31) Compaction Phase 28.379ms
[85.948s][info][gc,phases,start] GC(31) Post Compact
[85.948s][info][gc,phases      ] GC(31) Post Compact 0.187ms
[85.948s][info][gc,heap        ] GC(31) PSYoungGen: 33280K->33280K(38400K)
[85.948s][info][gc,heap        ] GC(31) ParOldGen: 87302K->87302K(87552K)
[85.948s][info][gc,metaspace   ] GC(31) Metaspace: 2401K->2401K(1056768K)
[85.948s][info][gc             ] GC(31) Pause Full (Ergonomics) 117M->117M(123M) 177.499ms
[85.948s][info][gc,cpu         ] GC(31) User=0.34s Sys=0.00s Real=0.18s
[85.948s][info][gc,start       ] GC(32) Pause Full (Ergonomics)
[85.948s][info][gc,phases,start] GC(32) Marking Phase
[86.097s][info][gc,phases      ] GC(32) Marking Phase 148.344ms
[86.097s][info][gc,phases,start] GC(32) Summary Phase
[86.097s][info][gc,phases      ] GC(32) Summary Phase 0.017ms
[86.097s][info][gc,phases,start] GC(32) Adjust Roots
[86.097s][info][gc,phases      ] GC(32) Adjust Roots 0.462ms
[86.097s][info][gc,phases,start] GC(32) Compaction Phase
[86.127s][info][gc,phases      ] GC(32) Compaction Phase 29.934ms
[86.127s][info][gc,phases,start] GC(32) Post Compact
[86.128s][info][gc,phases      ] GC(32) Post Compact 0.172ms
[86.128s][info][gc,heap        ] GC(32) PSYoungGen: 33280K->33280K(38400K)
[86.128s][info][gc,heap        ] GC(32) ParOldGen: 87304K->87304K(87552K)
[86.128s][info][gc,metaspace   ] GC(32) Metaspace: 2401K->2401K(1056768K)
[86.128s][info][gc             ] GC(32) Pause Full (Ergonomics) 117M->117M(123M) 179.189ms
[86.128s][info][gc,cpu         ] GC(32) User=0.38s Sys=0.00s Real=0.18s
[86.128s][info][gc,start       ] GC(33) Pause Full (Ergonomics)
[86.128s][info][gc,phases,start] GC(33) Marking Phase
[86.277s][info][gc,phases      ] GC(33) Marking Phase 149.124ms
[86.277s][info][gc,phases,start] GC(33) Summary Phase
[86.277s][info][gc,phases      ] GC(33) Summary Phase 0.016ms
[86.277s][info][gc,phases,start] GC(33) Adjust Roots
[86.278s][info][gc,phases      ] GC(33) Adjust Roots 0.565ms
[86.278s][info][gc,phases,start] GC(33) Compaction Phase
[86.309s][info][gc,phases      ] GC(33) Compaction Phase 31.200ms
[86.309s][info][gc,phases,start] GC(33) Post Compact
[86.309s][info][gc,phases      ] GC(33) Post Compact 0.172ms
[86.309s][info][gc,heap        ] GC(33) PSYoungGen: 33280K->33279K(38400K)
[86.309s][info][gc,heap        ] GC(33) ParOldGen: 87306K->87306K(87552K)
[86.309s][info][gc,metaspace   ] GC(33) Metaspace: 2401K->2401K(1056768K)
[86.309s][info][gc             ] GC(33) Pause Full (Ergonomics) 117M->117M(123M) 181.336ms
[86.309s][info][gc,cpu         ] GC(33) User=0.34s Sys=0.00s Real=0.18s
[86.309s][info][gc,start       ] GC(34) Pause Full (Ergonomics)
[86.309s][info][gc,phases,start] GC(34) Marking Phase
[86.455s][info][gc,phases      ] GC(34) Marking Phase 145.954ms
[86.455s][info][gc,phases,start] GC(34) Summary Phase
[86.455s][info][gc,phases      ] GC(34) Summary Phase 0.018ms
[86.456s][info][gc,phases,start] GC(34) Adjust Roots
[86.456s][info][gc,phases      ] GC(34) Adjust Roots 0.587ms
[86.456s][info][gc,phases,start] GC(34) Compaction Phase
[86.485s][info][gc,phases      ] GC(34) Compaction Phase 28.524ms
[86.485s][info][gc,phases,start] GC(34) Post Compact
[86.485s][info][gc,phases      ] GC(34) Post Compact 0.273ms
[86.485s][info][gc,heap        ] GC(34) PSYoungGen: 33279K->33279K(38400K)
[86.485s][info][gc,heap        ] GC(34) ParOldGen: 87309K->87309K(87552K)
[86.485s][info][gc,metaspace   ] GC(34) Metaspace: 2401K->2401K(1056768K)
[86.485s][info][gc             ] GC(34) Pause Full (Ergonomics) 117M->117M(123M) 175.661ms
[86.485s][info][gc,cpu         ] GC(34) User=0.34s Sys=0.00s Real=0.18s
[86.485s][info][gc,start       ] GC(35) Pause Full (Ergonomics)
[86.485s][info][gc,phases,start] GC(35) Marking Phase
[86.633s][info][gc,phases      ] GC(35) Marking Phase 147.106ms
[86.633s][info][gc,phases,start] GC(35) Summary Phase
[86.633s][info][gc,phases      ] GC(35) Summary Phase 0.017ms
[86.633s][info][gc,phases,start] GC(35) Adjust Roots
[86.633s][info][gc,phases      ] GC(35) Adjust Roots 0.824ms
[86.633s][info][gc,phases,start] GC(35) Compaction Phase
[86.661s][info][gc,phases      ] GC(35) Compaction Phase 27.876ms
[86.661s][info][gc,phases,start] GC(35) Post Compact
[86.662s][info][gc,phases      ] GC(35) Post Compact 0.173ms
[86.662s][info][gc,heap        ] GC(35) PSYoungGen: 33279K->33279K(38400K)
[86.662s][info][gc,heap        ] GC(35) ParOldGen: 87311K->87311K(87552K)
[86.662s][info][gc,metaspace   ] GC(35) Metaspace: 2401K->2401K(1056768K)
[86.662s][info][gc             ] GC(35) Pause Full (Ergonomics) 117M->117M(123M) 176.261ms
[86.662s][info][gc,cpu         ] GC(35) User=0.38s Sys=0.00s Real=0.18s
[86.662s][info][gc,start       ] GC(36) Pause Full (Ergonomics)
[86.662s][info][gc,phases,start] GC(36) Marking Phase
[86.809s][info][gc,phases      ] GC(36) Marking Phase 147.469ms
[86.809s][info][gc,phases,start] GC(36) Summary Phase
[86.809s][info][gc,phases      ] GC(36) Summary Phase 0.018ms
[86.809s][info][gc,phases,start] GC(36) Adjust Roots
[86.810s][info][gc,phases      ] GC(36) Adjust Roots 0.583ms
[86.810s][info][gc,phases,start] GC(36) Compaction Phase
[86.839s][info][gc,phases      ] GC(36) Compaction Phase 28.457ms
[86.839s][info][gc,phases,start] GC(36) Post Compact
[86.839s][info][gc,phases      ] GC(36) Post Compact 0.172ms
[86.839s][info][gc,heap        ] GC(36) PSYoungGen: 33279K->33279K(38400K)
[86.839s][info][gc,heap        ] GC(36) ParOldGen: 87313K->87313K(87552K)
[86.839s][info][gc,metaspace   ] GC(36) Metaspace: 2401K->2401K(1056768K)
[86.839s][info][gc             ] GC(36) Pause Full (Ergonomics) 117M->117M(123M) 177.001ms
[86.839s][info][gc,cpu         ] GC(36) User=0.34s Sys=0.00s Real=0.18s
[86.839s][info][gc,start       ] GC(37) Pause Full (Ergonomics)
[86.839s][info][gc,phases,start] GC(37) Marking Phase
[86.986s][info][gc,phases      ] GC(37) Marking Phase 147.320ms
[86.986s][info][gc,phases,start] GC(37) Summary Phase
[86.986s][info][gc,phases      ] GC(37) Summary Phase 0.018ms
[86.987s][info][gc,phases,start] GC(37) Adjust Roots
[86.987s][info][gc,phases      ] GC(37) Adjust Roots 0.672ms
[86.987s][info][gc,phases,start] GC(37) Compaction Phase
[87.015s][info][gc,phases      ] GC(37) Compaction Phase 28.113ms
[87.015s][info][gc,phases,start] GC(37) Post Compact
[87.016s][info][gc,phases      ] GC(37) Post Compact 0.173ms
[87.016s][info][gc,heap        ] GC(37) PSYoungGen: 33279K->33279K(38400K)
[87.016s][info][gc,heap        ] GC(37) ParOldGen: 87315K->87315K(87552K)
[87.016s][info][gc,metaspace   ] GC(37) Metaspace: 2401K->2401K(1056768K)
[87.016s][info][gc             ] GC(37) Pause Full (Ergonomics) 117M->117M(123M) 176.550ms
[87.016s][info][gc,cpu         ] GC(37) User=0.31s Sys=0.00s Real=0.18s
[87.016s][info][gc,start       ] GC(38) Pause Full (Ergonomics)
[87.016s][info][gc,phases,start] GC(38) Marking Phase
[87.162s][info][gc,phases      ] GC(38) Marking Phase 145.900ms
[87.162s][info][gc,phases,start] GC(38) Summary Phase
[87.162s][info][gc,phases      ] GC(38) Summary Phase 0.017ms
[87.162s][info][gc,phases,start] GC(38) Adjust Roots
[87.162s][info][gc,phases      ] GC(38) Adjust Roots 0.510ms
[87.162s][info][gc,phases,start] GC(38) Compaction Phase
[87.192s][info][gc,phases      ] GC(38) Compaction Phase 29.147ms
[87.192s][info][gc,phases,start] GC(38) Post Compact
[87.192s][info][gc,phases      ] GC(38) Post Compact 0.209ms
[87.192s][info][gc,heap        ] GC(38) PSYoungGen: 33279K->33279K(38400K)
[87.192s][info][gc,heap        ] GC(38) ParOldGen: 87318K->87318K(87552K)
[87.192s][info][gc,metaspace   ] GC(38) Metaspace: 2401K->2401K(1056768K)
[87.192s][info][gc             ] GC(38) Pause Full (Ergonomics) 117M->117M(123M) 176.118ms
[87.192s][info][gc,cpu         ] GC(38) User=0.38s Sys=0.00s Real=0.18s
[87.192s][info][gc,start       ] GC(39) Pause Full (Ergonomics)
[87.192s][info][gc,phases,start] GC(39) Marking Phase
[87.337s][info][gc,phases      ] GC(39) Marking Phase 144.514ms
[87.337s][info][gc,phases,start] GC(39) Summary Phase
[87.337s][info][gc,phases      ] GC(39) Summary Phase 0.017ms
[87.337s][info][gc,phases,start] GC(39) Adjust Roots
[87.337s][info][gc,phases      ] GC(39) Adjust Roots 0.425ms
[87.337s][info][gc,phases,start] GC(39) Compaction Phase
[87.368s][info][gc,phases      ] GC(39) Compaction Phase 30.558ms
[87.368s][info][gc,phases,start] GC(39) Post Compact
[87.368s][info][gc,phases      ] GC(39) Post Compact 0.171ms
[87.368s][info][gc,heap        ] GC(39) PSYoungGen: 33280K->33280K(38400K)
[87.368s][info][gc,heap        ] GC(39) ParOldGen: 87320K->87320K(87552K)
[87.368s][info][gc,metaspace   ] GC(39) Metaspace: 2401K->2401K(1056768K)
[87.368s][info][gc             ] GC(39) Pause Full (Ergonomics) 117M->117M(123M) 175.994ms
[87.368s][info][gc,cpu         ] GC(39) User=0.34s Sys=0.00s Real=0.18s
[87.369s][info][gc,start       ] GC(40) Pause Full (Ergonomics)
[87.369s][info][gc,phases,start] GC(40) Marking Phase
[87.512s][info][gc,phases      ] GC(40) Marking Phase 143.626ms
[87.512s][info][gc,phases,start] GC(40) Summary Phase
[87.512s][info][gc,phases      ] GC(40) Summary Phase 0.017ms
[87.512s][info][gc,phases,start] GC(40) Adjust Roots
[87.513s][info][gc,phases      ] GC(40) Adjust Roots 0.517ms
[87.513s][info][gc,phases,start] GC(40) Compaction Phase
[87.542s][info][gc,phases      ] GC(40) Compaction Phase 29.349ms
[87.542s][info][gc,phases,start] GC(40) Post Compact
[87.542s][info][gc,phases      ] GC(40) Post Compact 0.172ms
[87.543s][info][gc,heap        ] GC(40) PSYoungGen: 33280K->33280K(38400K)
[87.543s][info][gc,heap        ] GC(40) ParOldGen: 87322K->87322K(87552K)
[87.543s][info][gc,metaspace   ] GC(40) Metaspace: 2401K->2401K(1056768K)
[87.543s][info][gc             ] GC(40) Pause Full (Ergonomics) 117M->117M(123M) 173.958ms
[87.543s][info][gc,cpu         ] GC(40) User=0.34s Sys=0.00s Real=0.17s
[87.543s][info][gc,start       ] GC(41) Pause Full (Ergonomics)
[87.543s][info][gc,phases,start] GC(41) Marking Phase
[87.688s][info][gc,phases      ] GC(41) Marking Phase 144.622ms
[87.688s][info][gc,phases,start] GC(41) Summary Phase
[87.688s][info][gc,phases      ] GC(41) Summary Phase 0.018ms
[87.688s][info][gc,phases,start] GC(41) Adjust Roots
[87.688s][info][gc,phases      ] GC(41) Adjust Roots 0.503ms
[87.688s][info][gc,phases,start] GC(41) Compaction Phase
[87.717s][info][gc,phases      ] GC(41) Compaction Phase 29.286ms
[87.717s][info][gc,phases,start] GC(41) Post Compact
[87.718s][info][gc,phases      ] GC(41) Post Compact 0.174ms
[87.718s][info][gc,heap        ] GC(41) PSYoungGen: 33280K->33280K(38400K)
[87.718s][info][gc,heap        ] GC(41) ParOldGen: 87324K->87324K(87552K)
[87.718s][info][gc,metaspace   ] GC(41) Metaspace: 2401K->2401K(1056768K)
[87.718s][info][gc             ] GC(41) Pause Full (Ergonomics) 117M->117M(123M) 174.893ms
[87.718s][info][gc,cpu         ] GC(41) User=0.34s Sys=0.00s Real=0.17s
[87.718s][info][gc,start       ] GC(42) Pause Full (Ergonomics)
[87.718s][info][gc,phases,start] GC(42) Marking Phase
[87.868s][info][gc,phases      ] GC(42) Marking Phase 149.592ms
[87.868s][info][gc,phases,start] GC(42) Summary Phase
[87.868s][info][gc,phases      ] GC(42) Summary Phase 0.037ms
[87.868s][info][gc,phases,start] GC(42) Adjust Roots
[87.868s][info][gc,phases      ] GC(42) Adjust Roots 0.612ms
[87.868s][info][gc,phases,start] GC(42) Compaction Phase
[87.897s][info][gc,phases      ] GC(42) Compaction Phase 28.670ms
[87.897s][info][gc,phases,start] GC(42) Post Compact
[87.897s][info][gc,phases      ] GC(42) Post Compact 0.172ms
[87.897s][info][gc,heap        ] GC(42) PSYoungGen: 33280K->33280K(38400K)
[87.897s][info][gc,heap        ] GC(42) ParOldGen: 87327K->87327K(87552K)
[87.897s][info][gc,metaspace   ] GC(42) Metaspace: 2401K->2401K(1056768K)
[87.897s][info][gc             ] GC(42) Pause Full (Ergonomics) 117M->117M(123M) 179.344ms
[87.897s][info][gc,cpu         ] GC(42) User=0.38s Sys=0.00s Real=0.18s
[87.898s][info][gc,start       ] GC(43) Pause Full (Ergonomics)
[87.898s][info][gc,phases,start] GC(43) Marking Phase
[88.039s][info][gc,phases      ] GC(43) Marking Phase 141.850ms
[88.040s][info][gc,phases,start] GC(43) Summary Phase
[88.040s][info][gc,phases      ] GC(43) Summary Phase 0.030ms
[88.040s][info][gc,phases,start] GC(43) Adjust Roots
[88.040s][info][gc,phases      ] GC(43) Adjust Roots 0.552ms
[88.040s][info][gc,phases,start] GC(43) Compaction Phase
[88.069s][info][gc,phases      ] GC(43) Compaction Phase 28.871ms
[88.069s][info][gc,phases,start] GC(43) Post Compact
[88.069s][info][gc,phases      ] GC(43) Post Compact 0.172ms
[88.069s][info][gc,heap        ] GC(43) PSYoungGen: 33280K->33280K(38400K)
[88.069s][info][gc,heap        ] GC(43) ParOldGen: 87329K->87329K(87552K)
[88.069s][info][gc,metaspace   ] GC(43) Metaspace: 2401K->2401K(1056768K)
[88.069s][info][gc             ] GC(43) Pause Full (Ergonomics) 117M->117M(123M) 171.784ms
[88.069s][info][gc,cpu         ] GC(43) User=0.34s Sys=0.00s Real=0.17s
[88.070s][info][gc,start       ] GC(44) Pause Full (Ergonomics)
[88.070s][info][gc,phases,start] GC(44) Marking Phase
[88.214s][info][gc,phases      ] GC(44) Marking Phase 144.375ms
[88.214s][info][gc,phases,start] GC(44) Summary Phase
[88.214s][info][gc,phases      ] GC(44) Summary Phase 0.018ms
[88.214s][info][gc,phases,start] GC(44) Adjust Roots
[88.215s][info][gc,phases      ] GC(44) Adjust Roots 0.473ms
[88.215s][info][gc,phases,start] GC(44) Compaction Phase
[88.243s][info][gc,phases      ] GC(44) Compaction Phase 28.660ms
[88.243s][info][gc,phases,start] GC(44) Post Compact
[88.243s][info][gc,phases      ] GC(44) Post Compact 0.174ms
[88.244s][info][gc,heap        ] GC(44) PSYoungGen: 33280K->33280K(38400K)
[88.244s][info][gc,heap        ] GC(44) ParOldGen: 87331K->87331K(87552K)
[88.244s][info][gc,metaspace   ] GC(44) Metaspace: 2401K->2401K(1056768K)
[88.244s][info][gc             ] GC(44) Pause Full (Ergonomics) 117M->117M(123M) 173.954ms
[88.244s][info][gc,cpu         ] GC(44) User=0.34s Sys=0.00s Real=0.17s
[88.244s][info][gc,start       ] GC(45) Pause Full (Ergonomics)
[88.244s][info][gc,phases,start] GC(45) Marking Phase
[88.392s][info][gc,phases      ] GC(45) Marking Phase 148.082ms
[88.392s][info][gc,phases,start] GC(45) Summary Phase
[88.392s][info][gc,phases      ] GC(45) Summary Phase 0.020ms
[88.392s][info][gc,phases,start] GC(45) Adjust Roots
[88.393s][info][gc,phases      ] GC(45) Adjust Roots 0.456ms
[88.393s][info][gc,phases,start] GC(45) Compaction Phase
[88.421s][info][gc,phases      ] GC(45) Compaction Phase 28.834ms
[88.421s][info][gc,phases,start] GC(45) Post Compact
[88.422s][info][gc,phases      ] GC(45) Post Compact 0.173ms
[88.422s][info][gc,heap        ] GC(45) PSYoungGen: 33280K->33280K(38400K)
[88.422s][info][gc,heap        ] GC(45) ParOldGen: 87333K->87333K(87552K)
[88.422s][info][gc,metaspace   ] GC(45) Metaspace: 2401K->2401K(1056768K)
[88.422s][info][gc             ] GC(45) Pause Full (Ergonomics) 117M->117M(123M) 177.842ms
[88.422s][info][gc,cpu         ] GC(45) User=0.33s Sys=0.00s Real=0.18s
[88.422s][info][gc,start       ] GC(46) Pause Full (Ergonomics)
[88.422s][info][gc,phases,start] GC(46) Marking Phase
[88.571s][info][gc,phases      ] GC(46) Marking Phase 148.672ms
[88.571s][info][gc,phases,start] GC(46) Summary Phase
[88.571s][info][gc,phases      ] GC(46) Summary Phase 0.017ms
[88.571s][info][gc,phases,start] GC(46) Adjust Roots
[88.571s][info][gc,phases      ] GC(46) Adjust Roots 0.556ms
[88.571s][info][gc,phases,start] GC(46) Compaction Phase
[88.602s][info][gc,phases      ] GC(46) Compaction Phase 30.340ms
[88.602s][info][gc,phases,start] GC(46) Post Compact
[88.602s][info][gc,phases      ] GC(46) Post Compact 0.204ms
[88.602s][info][gc,heap        ] GC(46) PSYoungGen: 33280K->33280K(38400K)
[88.602s][info][gc,heap        ] GC(46) ParOldGen: 87335K->87335K(87552K)
[88.602s][info][gc,metaspace   ] GC(46) Metaspace: 2401K->2401K(1056768K)
[88.602s][info][gc             ] GC(46) Pause Full (Ergonomics) 117M->117M(123M) 180.179ms
[88.602s][info][gc,cpu         ] GC(46) User=0.38s Sys=0.00s Real=0.18s
[88.602s][info][gc,start       ] GC(47) Pause Full (Ergonomics)
[88.602s][info][gc,phases,start] GC(47) Marking Phase
[88.745s][info][gc,phases      ] GC(47) Marking Phase 142.349ms
[88.745s][info][gc,phases,start] GC(47) Summary Phase
[88.745s][info][gc,phases      ] GC(47) Summary Phase 0.018ms
[88.745s][info][gc,phases,start] GC(47) Adjust Roots
[88.745s][info][gc,phases      ] GC(47) Adjust Roots 0.429ms
[88.745s][info][gc,phases,start] GC(47) Compaction Phase
[88.775s][info][gc,phases      ] GC(47) Compaction Phase 29.618ms
[88.775s][info][gc,phases,start] GC(47) Post Compact
[88.775s][info][gc,phases      ] GC(47) Post Compact 0.166ms
[88.775s][info][gc,heap        ] GC(47) PSYoungGen: 33280K->33280K(38400K)
[88.775s][info][gc,heap        ] GC(47) ParOldGen: 87338K->87338K(87552K)
[88.775s][info][gc,metaspace   ] GC(47) Metaspace: 2401K->2401K(1056768K)
[88.775s][info][gc             ] GC(47) Pause Full (Ergonomics) 117M->117M(123M) 172.922ms
[88.775s][info][gc,cpu         ] GC(47) User=0.34s Sys=0.00s Real=0.17s
[88.776s][info][gc,start       ] GC(48) Pause Full (Ergonomics)
[88.776s][info][gc,phases,start] GC(48) Marking Phase
[88.922s][info][gc,phases      ] GC(48) Marking Phase 146.454ms
[88.922s][info][gc,phases,start] GC(48) Summary Phase
[88.922s][info][gc,phases      ] GC(48) Summary Phase 0.032ms
[88.922s][info][gc,phases,start] GC(48) Adjust Roots
[88.923s][info][gc,phases      ] GC(48) Adjust Roots 0.795ms
[88.923s][info][gc,phases,start] GC(48) Compaction Phase
[88.973s][info][gc,phases      ] GC(48) Compaction Phase 49.518ms
[88.973s][info][gc,phases,start] GC(48) Post Compact
[88.973s][info][gc,phases      ] GC(48) Post Compact 0.234ms
[88.973s][info][gc,heap        ] GC(48) PSYoungGen: 33280K->33280K(38400K)
[88.973s][info][gc,heap        ] GC(48) ParOldGen: 87340K->87336K(87552K)
[88.973s][info][gc,metaspace   ] GC(48) Metaspace: 2401K->2401K(1056768K)
[88.973s][info][gc             ] GC(48) Pause Full (Ergonomics) 117M->117M(123M) 197.434ms
[88.973s][info][gc,cpu         ] GC(48) User=0.38s Sys=0.00s Real=0.20s
[88.974s][info][gc,start       ] GC(49) Pause Full (Ergonomics)
[88.974s][info][gc,phases,start] GC(49) Marking Phase
[88.976s][info][gc,phases      ] GC(49) Marking Phase 2.178ms
[88.976s][info][gc,phases,start] GC(49) Summary Phase
[88.976s][info][gc,phases      ] GC(49) Summary Phase 0.016ms
[88.976s][info][gc,phases,start] GC(49) Adjust Roots
[88.977s][info][gc,phases      ] GC(49) Adjust Roots 0.939ms
[88.977s][info][gc,phases,start] GC(49) Compaction Phase
[88.980s][info][gc,phases      ] GC(49) Compaction Phase 2.795ms
[88.980s][info][gc,phases,start] GC(49) Post Compact
[88.980s][info][gc,phases      ] GC(49) Post Compact 0.233ms
[88.980s][info][gc,heap        ] GC(49) PSYoungGen: 33280K->0K(38400K)
[88.981s][info][gc,heap        ] GC(49) ParOldGen: 87338K->1708K(79360K)
[88.981s][info][gc,metaspace   ] GC(49) Metaspace: 2401K->2401K(1056768K)
[88.981s][info][gc             ] GC(49) Pause Full (Ergonomics) 117M->1M(115M) 7.045ms
[88.981s][info][gc,cpu         ] GC(49) User=0.00s Sys=0.00s Real=0.01s
[88.982s][info][gc,heap,exit   ] Heap
[88.982s][info][gc,heap,exit   ]  PSYoungGen      total 38400K, used 563K [0x00000000fd580000, 0x0000000100000000, 0x0000000100000000)
[88.982s][info][gc,heap,exit   ]   eden space 33280K, 1% used [0x00000000fd580000,0x00000000fd60cf70,0x00000000ff600000)
[88.982s][info][gc,heap,exit   ]   from space 5120K, 0% used [0x00000000ffb00000,0x00000000ffb00000,0x0000000100000000)
[88.982s][info][gc,heap,exit   ]   to   space 5120K, 0% used [0x00000000ff600000,0x00000000ff600000,0x00000000ffb00000)
[88.982s][info][gc,heap,exit   ]  ParOldGen       total 79360K, used 1708K [0x00000000f8000000, 0x00000000fcd80000, 0x00000000fd580000)
[88.982s][info][gc,heap,exit   ]   object space 79360K, 2% used [0x00000000f8000000,0x00000000f81ab240,0x00000000fcd80000)
[88.982s][info][gc,heap,exit   ]  Metaspace       used 2412K, capacity 4745K, committed 4864K, reserved 1056768K
[88.982s][info][gc,heap,exit   ]   class space    used 266K, capacity 452K, committed 512K, reserved 1048576K
```

</details>
VMOptions: ```-Xmx128m -Xms128m -Xloggc:gc_parrallel.log -XX:+PrintGCDetails -XX:+UseParallelGC```

## CMS

<details>
<summary>Trace:</summary>

```
[0.014s][info][gc] Using Concurrent Mark Sweep
[0.014s][info][gc,heap,coops] Heap address: 0x00000000f8000000, size: 128 MB, Compressed Oops mode: 32-bit
[2.695s][info][gc,start     ] GC(0) Pause Young (Allocation Failure)
[2.695s][info][gc,task      ] GC(0) Using 2 workers of 8 for evacuation
[2.770s][info][gc,heap      ] GC(0) ParNew: 34944K->4351K(39296K)
[2.770s][info][gc,heap      ] GC(0) CMS: 0K->16038K(87424K)
[2.770s][info][gc,metaspace ] GC(0) Metaspace: 1665K->1665K(1056768K)
[2.770s][info][gc           ] GC(0) Pause Young (Allocation Failure) 34M->19M(123M) 74.937ms
[2.770s][info][gc,cpu       ] GC(0) User=0.13s Sys=0.00s Real=0.08s
[6.157s][info][gc,start     ] GC(1) Pause Young (Allocation Failure)
[6.162s][info][gc,task      ] GC(1) Using 2 workers of 8 for evacuation
[6.205s][info][gc,heap      ] GC(1) ParNew: 39295K->4352K(39296K)
[6.205s][info][gc,heap      ] GC(1) CMS: 16038K->44558K(87424K)
[6.205s][info][gc,metaspace ] GC(1) Metaspace: 2427K->2427K(1056768K)
[6.205s][info][gc           ] GC(1) Pause Young (Allocation Failure) 54M->47M(123M) 48.319ms
[6.206s][info][gc,cpu       ] GC(1) User=0.05s Sys=0.02s Real=0.05s
[6.206s][info][gc,start     ] GC(2) Pause Initial Mark
[6.207s][info][gc           ] GC(2) Pause Initial Mark 48M->48M(123M) 1.043ms
[6.207s][info][gc,cpu       ] GC(2) User=0.00s Sys=0.00s Real=0.00s
[6.207s][info][gc           ] GC(2) Concurrent Mark
[6.207s][info][gc,task      ] GC(2) Using 2 workers of 2 for marking
[6.237s][info][gc           ] GC(2) Concurrent Mark 29.679ms
[6.237s][info][gc,cpu       ] GC(2) User=0.13s Sys=0.00s Real=0.03s
[6.237s][info][gc           ] GC(2) Concurrent Preclean
[6.237s][info][gc           ] GC(2) Concurrent Preclean 0.256ms
[6.237s][info][gc,cpu       ] GC(2) User=0.00s Sys=0.00s Real=0.00s
[6.237s][info][gc           ] GC(2) Concurrent Abortable Preclean
[11.266s][info][gc           ] GC(2) Concurrent Abortable Preclean 5028.863ms
[11.266s][info][gc,cpu       ] GC(2) User=6.02s Sys=0.00s Real=5.03s
[11.266s][info][gc,start     ] GC(2) Pause Remark
[11.271s][info][gc           ] GC(2) Pause Remark 62M->62M(123M) 4.778ms
[11.271s][info][gc,cpu       ] GC(2) User=0.00s Sys=0.00s Real=0.01s
[11.271s][info][gc           ] GC(2) Concurrent Sweep
[11.284s][info][gc           ] GC(2) Concurrent Sweep 13.377ms
[11.285s][info][gc,cpu       ] GC(2) User=0.03s Sys=0.00s Real=0.01s
[11.285s][info][gc           ] GC(2) Concurrent Reset
[11.285s][info][gc           ] GC(2) Concurrent Reset 0.636ms
[11.285s][info][gc,cpu       ] GC(2) User=0.00s Sys=0.00s Real=0.00s
[11.285s][info][gc,heap      ] GC(2) Old: 44558K->37360K(87424K)
[13.285s][info][gc,start     ] GC(3) Pause Initial Mark
[13.291s][info][gc           ] GC(3) Pause Initial Mark 55M->55M(123M) 6.321ms
[13.291s][info][gc,cpu       ] GC(3) User=0.03s Sys=0.00s Real=0.01s
[13.291s][info][gc           ] GC(3) Concurrent Mark
[13.292s][info][gc,task      ] GC(3) Using 2 workers of 2 for marking
[13.316s][info][gc           ] GC(3) Concurrent Mark 24.677ms
[13.316s][info][gc,cpu       ] GC(3) User=0.05s Sys=0.00s Real=0.03s
[13.316s][info][gc           ] GC(3) Concurrent Preclean
[13.316s][info][gc           ] GC(3) Concurrent Preclean 0.172ms
[13.316s][info][gc,cpu       ] GC(3) User=0.00s Sys=0.00s Real=0.00s
[13.316s][info][gc           ] GC(3) Concurrent Abortable Preclean
[18.406s][info][gc           ] GC(3) Concurrent Abortable Preclean 5089.471ms
[18.406s][info][gc,cpu       ] GC(3) User=6.17s Sys=0.00s Real=5.09s
[18.406s][info][gc,start     ] GC(3) Pause Remark
[18.410s][info][gc           ] GC(3) Pause Remark 55M->55M(123M) 4.064ms
[18.410s][info][gc,cpu       ] GC(3) User=0.00s Sys=0.00s Real=0.00s
[18.410s][info][gc           ] GC(3) Concurrent Sweep
[18.425s][info][gc           ] GC(3) Concurrent Sweep 14.182ms
[18.425s][info][gc,cpu       ] GC(3) User=0.03s Sys=0.00s Real=0.01s
[18.425s][info][gc           ] GC(3) Concurrent Reset
[18.425s][info][gc           ] GC(3) Concurrent Reset 0.060ms
[18.425s][info][gc,cpu       ] GC(3) User=0.00s Sys=0.00s Real=0.00s
[18.425s][info][gc,heap      ] GC(3) Old: 37360K->29987K(87424K)
[19.395s][info][gc,start     ] GC(4) Pause Young (Allocation Failure)
[19.395s][info][gc,task      ] GC(4) Using 2 workers of 8 for evacuation
[19.437s][info][gc,heap      ] GC(4) ParNew: 39296K->4352K(39296K)
[19.437s][info][gc,heap      ] GC(4) CMS: 29987K->56641K(87424K)
[19.437s][info][gc,metaspace ] GC(4) Metaspace: 2446K->2446K(1056768K)
[19.437s][info][gc           ] GC(4) Pause Young (Allocation Failure) 67M->59M(123M) 41.536ms
[19.437s][info][gc,cpu       ] GC(4) User=0.08s Sys=0.02s Real=0.04s
[19.437s][info][gc,start     ] GC(5) Pause Initial Mark
[19.438s][info][gc           ] GC(5) Pause Initial Mark 60M->60M(123M) 0.826ms
[19.438s][info][gc,cpu       ] GC(5) User=0.00s Sys=0.00s Real=0.00s
[19.438s][info][gc           ] GC(5) Concurrent Mark
[19.438s][info][gc,task      ] GC(5) Using 2 workers of 2 for marking
[19.456s][info][gc,start     ] GC(6) Pause Young (Allocation Failure)
[19.456s][info][gc,task      ] GC(6) Using 2 workers of 8 for evacuation
[19.456s][info][gc           ] GC(6) Pause Young (Allocation Failure) 93M->93M(123M) 0.129ms
[19.456s][info][gc,cpu       ] GC(6) User=0.00s Sys=0.00s Real=0.00s
[19.456s][info][gc,start     ] GC(7) Pause Full (Allocation Failure)
[19.480s][info][gc           ] GC(5) Concurrent Mark 42.303ms
[19.480s][info][gc,cpu       ] GC(5) User=0.11s Sys=0.00s Real=0.04s
[19.481s][info][gc,phases,start] GC(7) Phase 1: Mark live objects
[19.514s][info][gc,phases      ] GC(7) Phase 1: Mark live objects 33.522ms
[19.514s][info][gc,phases,start] GC(7) Phase 2: Compute new object addresses
[19.547s][info][gc,phases      ] GC(7) Phase 2: Compute new object addresses 33.320ms
[19.548s][info][gc,phases,start] GC(7) Phase 3: Adjust pointers
[19.579s][info][gc,phases      ] GC(7) Phase 3: Adjust pointers 31.273ms
[19.579s][info][gc,phases,start] GC(7) Phase 4: Move objects
[19.609s][info][gc,phases      ] GC(7) Phase 4: Move objects 29.621ms
[19.609s][info][gc,heap        ] GC(7) ParNew: 39296K->0K(39296K)
[19.609s][info][gc,heap        ] GC(7) CMS: 56641K->79580K(87424K)
[19.609s][info][gc,metaspace   ] GC(7) Metaspace: 2449K->2449K(1056768K)
[19.609s][info][gc             ] GC(7) Pause Full (Allocation Failure) 93M->77M(123M) 153.035ms
[19.609s][info][gc,cpu         ] GC(7) User=0.19s Sys=0.00s Real=0.15s
[21.610s][info][gc,start       ] GC(8) Pause Initial Mark
[21.624s][info][gc             ] GC(8) Pause Initial Mark 103M->103M(123M) 14.325ms
[21.624s][info][gc,cpu         ] GC(8) User=0.02s Sys=0.00s Real=0.01s
[21.625s][info][gc             ] GC(8) Concurrent Mark
[21.625s][info][gc,task        ] GC(8) Using 2 workers of 2 for marking
[21.677s][info][gc             ] GC(8) Concurrent Mark 52.019ms
[21.677s][info][gc,cpu         ] GC(8) User=0.14s Sys=0.00s Real=0.05s
[21.677s][info][gc             ] GC(8) Concurrent Preclean
[21.677s][info][gc             ] GC(8) Concurrent Preclean 0.207ms
[21.677s][info][gc,cpu         ] GC(8) User=0.00s Sys=0.00s Real=0.00s
[21.677s][info][gc             ] GC(8) Concurrent Abortable Preclean
[21.677s][info][gc             ] GC(8) Concurrent Abortable Preclean 0.017ms
[21.677s][info][gc,cpu         ] GC(8) User=0.00s Sys=0.00s Real=0.00s
[21.677s][info][gc,start       ] GC(8) Pause Remark
[21.686s][info][gc             ] GC(8) Pause Remark 103M->103M(123M) 8.660ms
[21.686s][info][gc,cpu         ] GC(8) User=0.00s Sys=0.00s Real=0.01s
[21.686s][info][gc             ] GC(8) Concurrent Sweep
[21.709s][info][gc             ] GC(8) Concurrent Sweep 22.778ms
[21.709s][info][gc,cpu         ] GC(8) User=0.06s Sys=0.00s Real=0.02s
[21.709s][info][gc             ] GC(8) Concurrent Reset
[21.709s][info][gc             ] GC(8) Concurrent Reset 0.079ms
[21.709s][info][gc,cpu         ] GC(8) User=0.00s Sys=0.00s Real=0.00s
[21.709s][info][gc,heap        ] GC(8) Old: 79580K->74171K(87424K)
[23.709s][info][gc,start       ] GC(9) Pause Initial Mark
[23.724s][info][gc             ] GC(9) Pause Initial Mark 98M->98M(123M) 15.116ms
[23.725s][info][gc,cpu         ] GC(9) User=0.02s Sys=0.00s Real=0.02s
[23.725s][info][gc             ] GC(9) Concurrent Mark
[23.725s][info][gc,task        ] GC(9) Using 2 workers of 2 for marking
[23.775s][info][gc             ] GC(9) Concurrent Mark 50.414ms
[23.775s][info][gc,cpu         ] GC(9) User=0.14s Sys=0.00s Real=0.05s
[23.775s][info][gc             ] GC(9) Concurrent Preclean
[23.776s][info][gc             ] GC(9) Concurrent Preclean 0.199ms
[23.776s][info][gc,cpu         ] GC(9) User=0.00s Sys=0.00s Real=0.00s
[23.776s][info][gc             ] GC(9) Concurrent Abortable Preclean
[23.776s][info][gc             ] GC(9) Concurrent Abortable Preclean 0.017ms
[23.776s][info][gc,cpu         ] GC(9) User=0.00s Sys=0.00s Real=0.00s
[23.776s][info][gc,start       ] GC(9) Pause Remark
[23.785s][info][gc             ] GC(9) Pause Remark 98M->98M(123M) 9.297ms
[23.785s][info][gc,cpu         ] GC(9) User=0.00s Sys=0.00s Real=0.01s
[23.785s][info][gc             ] GC(9) Concurrent Sweep
[23.811s][info][gc             ] GC(9) Concurrent Sweep 25.255ms
[23.811s][info][gc,cpu         ] GC(9) User=0.06s Sys=0.00s Real=0.03s
[23.811s][info][gc             ] GC(9) Concurrent Reset
[23.811s][info][gc             ] GC(9) Concurrent Reset 0.076ms
[23.811s][info][gc,cpu         ] GC(9) User=0.00s Sys=0.00s Real=0.00s
[23.811s][info][gc,heap        ] GC(9) Old: 74171K->73472K(87424K)
[25.811s][info][gc,start       ] GC(10) Pause Initial Mark
[25.826s][info][gc             ] GC(10) Pause Initial Mark 97M->97M(123M) 14.813ms
[25.826s][info][gc,cpu         ] GC(10) User=0.02s Sys=0.00s Real=0.02s
[25.826s][info][gc             ] GC(10) Concurrent Mark
[25.826s][info][gc,task        ] GC(10) Using 2 workers of 2 for marking
[25.877s][info][gc             ] GC(10) Concurrent Mark 50.337ms
[25.877s][info][gc,cpu         ] GC(10) User=0.14s Sys=0.00s Real=0.05s
[25.877s][info][gc             ] GC(10) Concurrent Preclean
[25.877s][info][gc             ] GC(10) Concurrent Preclean 0.206ms
[25.877s][info][gc,cpu         ] GC(10) User=0.00s Sys=0.00s Real=0.00s
[25.877s][info][gc             ] GC(10) Concurrent Abortable Preclean
[25.877s][info][gc             ] GC(10) Concurrent Abortable Preclean 0.019ms
[25.877s][info][gc,cpu         ] GC(10) User=0.00s Sys=0.00s Real=0.00s
[25.877s][info][gc,start       ] GC(10) Pause Remark
[25.886s][info][gc             ] GC(10) Pause Remark 97M->97M(123M) 9.010ms
[25.886s][info][gc,cpu         ] GC(10) User=0.03s Sys=0.00s Real=0.01s
[25.886s][info][gc             ] GC(10) Concurrent Sweep
[25.909s][info][gc             ] GC(10) Concurrent Sweep 22.918ms
[25.909s][info][gc,cpu         ] GC(10) User=0.03s Sys=0.00s Real=0.02s
[25.910s][info][gc             ] GC(10) Concurrent Reset
[25.910s][info][gc             ] GC(10) Concurrent Reset 0.079ms
[25.910s][info][gc,cpu         ] GC(10) User=0.00s Sys=0.00s Real=0.00s
[25.910s][info][gc,heap        ] GC(10) Old: 73472K->72759K(87424K)
[27.909s][info][gc,start       ] GC(11) Pause Initial Mark
[27.926s][info][gc             ] GC(11) Pause Initial Mark 97M->97M(123M) 17.021ms
[27.927s][info][gc,cpu         ] GC(11) User=0.03s Sys=0.00s Real=0.02s
[27.927s][info][gc             ] GC(11) Concurrent Mark
[27.927s][info][gc,task        ] GC(11) Using 2 workers of 2 for marking
[27.975s][info][gc             ] GC(11) Concurrent Mark 48.587ms
[27.975s][info][gc,cpu         ] GC(11) User=0.19s Sys=0.00s Real=0.05s
[27.975s][info][gc             ] GC(11) Concurrent Preclean
[27.975s][info][gc             ] GC(11) Concurrent Preclean 0.199ms
[27.976s][info][gc,cpu         ] GC(11) User=0.00s Sys=0.00s Real=0.00s
[27.976s][info][gc             ] GC(11) Concurrent Abortable Preclean
[27.976s][info][gc             ] GC(11) Concurrent Abortable Preclean 0.017ms
[27.976s][info][gc,cpu         ] GC(11) User=0.00s Sys=0.00s Real=0.00s
[27.976s][info][gc,start       ] GC(11) Pause Remark
[27.985s][info][gc             ] GC(11) Pause Remark 97M->97M(123M) 9.579ms
[27.985s][info][gc,cpu         ] GC(11) User=0.00s Sys=0.00s Real=0.01s
[27.985s][info][gc             ] GC(11) Concurrent Sweep
[28.008s][info][gc             ] GC(11) Concurrent Sweep 22.296ms
[28.008s][info][gc,cpu         ] GC(11) User=0.06s Sys=0.00s Real=0.02s
[28.008s][info][gc             ] GC(11) Concurrent Reset
[28.008s][info][gc             ] GC(11) Concurrent Reset 0.081ms
[28.008s][info][gc,cpu         ] GC(11) User=0.00s Sys=0.00s Real=0.00s
[28.008s][info][gc,heap        ] GC(11) Old: 72759K->72007K(87424K)
[30.007s][info][gc,start       ] GC(12) Pause Initial Mark
[30.023s][info][gc             ] GC(12) Pause Initial Mark 96M->96M(123M) 15.214ms
[30.023s][info][gc,cpu         ] GC(12) User=0.02s Sys=0.00s Real=0.01s
[30.023s][info][gc             ] GC(12) Concurrent Mark
[30.023s][info][gc,task        ] GC(12) Using 2 workers of 2 for marking
[30.076s][info][gc             ] GC(12) Concurrent Mark 53.278ms
[30.076s][info][gc,cpu         ] GC(12) User=0.14s Sys=0.00s Real=0.05s
[30.076s][info][gc             ] GC(12) Concurrent Preclean
[30.076s][info][gc             ] GC(12) Concurrent Preclean 0.192ms
[30.076s][info][gc,cpu         ] GC(12) User=0.00s Sys=0.00s Real=0.00s
[30.076s][info][gc             ] GC(12) Concurrent Abortable Preclean
[30.076s][info][gc             ] GC(12) Concurrent Abortable Preclean 0.017ms
[30.076s][info][gc,cpu         ] GC(12) User=0.00s Sys=0.00s Real=0.00s
[30.077s][info][gc,start       ] GC(12) Pause Remark
[30.086s][info][gc             ] GC(12) Pause Remark 96M->96M(123M) 8.986ms
[30.086s][info][gc,cpu         ] GC(12) User=0.03s Sys=0.00s Real=0.01s
[30.086s][info][gc             ] GC(12) Concurrent Sweep
[30.108s][info][gc             ] GC(12) Concurrent Sweep 22.079ms
[30.108s][info][gc,cpu         ] GC(12) User=0.03s Sys=0.00s Real=0.02s
[30.108s][info][gc             ] GC(12) Concurrent Reset
[30.108s][info][gc             ] GC(12) Concurrent Reset 0.081ms
[30.108s][info][gc,cpu         ] GC(12) User=0.00s Sys=0.00s Real=0.00s
[30.108s][info][gc,heap        ] GC(12) Old: 72007K->71230K(87424K)
[32.109s][info][gc,start       ] GC(13) Pause Initial Mark
[32.124s][info][gc             ] GC(13) Pause Initial Mark 95M->95M(123M) 15.703ms
[32.124s][info][gc,cpu         ] GC(13) User=0.02s Sys=0.00s Real=0.02s
[32.124s][info][gc             ] GC(13) Concurrent Mark
[32.124s][info][gc,task        ] GC(13) Using 2 workers of 2 for marking
[32.173s][info][gc             ] GC(13) Concurrent Mark 48.293ms
[32.173s][info][gc,cpu         ] GC(13) User=0.14s Sys=0.00s Real=0.05s
[32.173s][info][gc             ] GC(13) Concurrent Preclean
[32.173s][info][gc             ] GC(13) Concurrent Preclean 0.226ms
[32.173s][info][gc,cpu         ] GC(13) User=0.00s Sys=0.00s Real=0.00s
[32.173s][info][gc             ] GC(13) Concurrent Abortable Preclean
[32.173s][info][gc             ] GC(13) Concurrent Abortable Preclean 0.031ms
[32.173s][info][gc,cpu         ] GC(13) User=0.00s Sys=0.00s Real=0.00s
[32.173s][info][gc,start       ] GC(13) Pause Remark
[32.182s][info][gc             ] GC(13) Pause Remark 95M->95M(123M) 8.799ms
[32.182s][info][gc,cpu         ] GC(13) User=0.03s Sys=0.00s Real=0.01s
[32.182s][info][gc             ] GC(13) Concurrent Sweep
[32.205s][info][gc             ] GC(13) Concurrent Sweep 22.575ms
[32.205s][info][gc,cpu         ] GC(13) User=0.03s Sys=0.00s Real=0.02s
[32.205s][info][gc             ] GC(13) Concurrent Reset
[32.205s][info][gc             ] GC(13) Concurrent Reset 0.113ms
[32.205s][info][gc,cpu         ] GC(13) User=0.00s Sys=0.00s Real=0.00s
[32.205s][info][gc,heap        ] GC(13) Old: 71230K->70467K(87424K)
[34.205s][info][gc,start       ] GC(14) Pause Initial Mark
[34.220s][info][gc             ] GC(14) Pause Initial Mark 94M->94M(123M) 14.752ms
[34.220s][info][gc,cpu         ] GC(14) User=0.03s Sys=0.00s Real=0.01s
[34.220s][info][gc             ] GC(14) Concurrent Mark
[34.220s][info][gc,task        ] GC(14) Using 2 workers of 2 for marking
[34.276s][info][gc             ] GC(14) Concurrent Mark 55.685ms
[34.276s][info][gc,cpu         ] GC(14) User=0.19s Sys=0.00s Real=0.05s
[34.276s][info][gc             ] GC(14) Concurrent Preclean
[34.276s][info][gc             ] GC(14) Concurrent Preclean 0.370ms
[34.277s][info][gc,cpu         ] GC(14) User=0.00s Sys=0.00s Real=0.00s
[34.277s][info][gc             ] GC(14) Concurrent Abortable Preclean
[34.277s][info][gc             ] GC(14) Concurrent Abortable Preclean 0.041ms
[34.277s][info][gc,cpu         ] GC(14) User=0.00s Sys=0.00s Real=0.00s
[34.277s][info][gc,start       ] GC(14) Pause Remark
[34.286s][info][gc             ] GC(14) Pause Remark 94M->94M(123M) 9.075ms
[34.286s][info][gc,cpu         ] GC(14) User=0.00s Sys=0.00s Real=0.01s
[34.286s][info][gc             ] GC(14) Concurrent Sweep
[34.310s][info][gc             ] GC(14) Concurrent Sweep 23.375ms
[34.310s][info][gc,cpu         ] GC(14) User=0.06s Sys=0.00s Real=0.02s
[34.310s][info][gc             ] GC(14) Concurrent Reset
[34.310s][info][gc             ] GC(14) Concurrent Reset 0.072ms
[34.310s][info][gc,cpu         ] GC(14) User=0.00s Sys=0.00s Real=0.00s
[34.310s][info][gc,heap        ] GC(14) Old: 70467K->69641K(87424K)
[36.310s][info][gc,start       ] GC(15) Pause Initial Mark
[36.325s][info][gc             ] GC(15) Pause Initial Mark 94M->94M(123M) 15.052ms
[36.325s][info][gc,cpu         ] GC(15) User=0.02s Sys=0.00s Real=0.01s
[36.325s][info][gc             ] GC(15) Concurrent Mark
[36.325s][info][gc,task        ] GC(15) Using 2 workers of 2 for marking
[36.375s][info][gc             ] GC(15) Concurrent Mark 50.064ms
[36.375s][info][gc,cpu         ] GC(15) User=0.14s Sys=0.00s Real=0.05s
[36.375s][info][gc             ] GC(15) Concurrent Preclean
[36.375s][info][gc             ] GC(15) Concurrent Preclean 0.312ms
[36.375s][info][gc,cpu         ] GC(15) User=0.00s Sys=0.00s Real=0.00s
[36.375s][info][gc             ] GC(15) Concurrent Abortable Preclean
[36.375s][info][gc             ] GC(15) Concurrent Abortable Preclean 0.016ms
[36.375s][info][gc,cpu         ] GC(15) User=0.00s Sys=0.00s Real=0.00s
[36.376s][info][gc,start       ] GC(15) Pause Remark
[36.385s][info][gc             ] GC(15) Pause Remark 94M->94M(123M) 9.218ms
[36.385s][info][gc,cpu         ] GC(15) User=0.03s Sys=0.00s Real=0.01s
[36.385s][info][gc             ] GC(15) Concurrent Sweep
[36.407s][info][gc             ] GC(15) Concurrent Sweep 21.987ms
[36.407s][info][gc,cpu         ] GC(15) User=0.03s Sys=0.00s Real=0.02s
[36.407s][info][gc             ] GC(15) Concurrent Reset
[36.407s][info][gc             ] GC(15) Concurrent Reset 0.111ms
[36.407s][info][gc,cpu         ] GC(15) User=0.00s Sys=0.00s Real=0.00s
[36.407s][info][gc,heap        ] GC(15) Old: 69641K->68808K(87424K)
[38.408s][info][gc,start       ] GC(16) Pause Initial Mark
[38.424s][info][gc             ] GC(16) Pause Initial Mark 93M->93M(123M) 15.589ms
[38.424s][info][gc,cpu         ] GC(16) User=0.03s Sys=0.00s Real=0.02s
[38.424s][info][gc             ] GC(16) Concurrent Mark
[38.424s][info][gc,task        ] GC(16) Using 2 workers of 2 for marking
[38.470s][info][gc             ] GC(16) Concurrent Mark 46.274ms
[38.471s][info][gc,cpu         ] GC(16) User=0.14s Sys=0.00s Real=0.05s
[38.471s][info][gc             ] GC(16) Concurrent Preclean
[38.471s][info][gc             ] GC(16) Concurrent Preclean 0.261ms
[38.471s][info][gc,cpu         ] GC(16) User=0.00s Sys=0.00s Real=0.00s
[38.471s][info][gc             ] GC(16) Concurrent Abortable Preclean
[38.471s][info][gc             ] GC(16) Concurrent Abortable Preclean 0.017ms
[38.471s][info][gc,cpu         ] GC(16) User=0.00s Sys=0.00s Real=0.00s
[38.471s][info][gc,start       ] GC(16) Pause Remark
[38.480s][info][gc             ] GC(16) Pause Remark 93M->93M(123M) 9.156ms
[38.480s][info][gc,cpu         ] GC(16) User=0.03s Sys=0.00s Real=0.01s
[38.480s][info][gc             ] GC(16) Concurrent Sweep
[38.505s][info][gc             ] GC(16) Concurrent Sweep 24.610ms
[38.505s][info][gc,cpu         ] GC(16) User=0.03s Sys=0.00s Real=0.02s
[38.505s][info][gc             ] GC(16) Concurrent Reset
[38.505s][info][gc             ] GC(16) Concurrent Reset 0.144ms
[38.505s][info][gc,cpu         ] GC(16) User=0.00s Sys=0.00s Real=0.00s
[38.505s][info][gc,heap        ] GC(16) Old: 68808K->67956K(87424K)
[40.506s][info][gc,start       ] GC(17) Pause Initial Mark
[40.522s][info][gc             ] GC(17) Pause Initial Mark 92M->92M(123M) 15.224ms
[40.522s][info][gc,cpu         ] GC(17) User=0.02s Sys=0.00s Real=0.01s
[40.522s][info][gc             ] GC(17) Concurrent Mark
[40.522s][info][gc,task        ] GC(17) Using 2 workers of 2 for marking
[40.566s][info][gc             ] GC(17) Concurrent Mark 44.660ms
[40.566s][info][gc,cpu         ] GC(17) User=0.09s Sys=0.00s Real=0.05s
[40.566s][info][gc             ] GC(17) Concurrent Preclean
[40.567s][info][gc             ] GC(17) Concurrent Preclean 0.232ms
[40.567s][info][gc,cpu         ] GC(17) User=0.00s Sys=0.00s Real=0.00s
[40.567s][info][gc             ] GC(17) Concurrent Abortable Preclean
[40.567s][info][gc             ] GC(17) Concurrent Abortable Preclean 0.017ms
[40.567s][info][gc,cpu         ] GC(17) User=0.00s Sys=0.00s Real=0.00s
[40.567s][info][gc,start       ] GC(17) Pause Remark
[40.577s][info][gc             ] GC(17) Pause Remark 92M->92M(123M) 9.690ms
[40.577s][info][gc,cpu         ] GC(17) User=0.03s Sys=0.00s Real=0.01s
[40.577s][info][gc             ] GC(17) Concurrent Sweep
[40.599s][info][gc             ] GC(17) Concurrent Sweep 21.819ms
[40.599s][info][gc,cpu         ] GC(17) User=0.03s Sys=0.00s Real=0.02s
[40.599s][info][gc             ] GC(17) Concurrent Reset
[40.599s][info][gc             ] GC(17) Concurrent Reset 0.071ms
[40.599s][info][gc,cpu         ] GC(17) User=0.00s Sys=0.00s Real=0.00s
[40.599s][info][gc,heap        ] GC(17) Old: 67956K->67011K(87424K)
[42.598s][info][gc,start       ] GC(18) Pause Initial Mark
[42.612s][info][gc             ] GC(18) Pause Initial Mark 91M->91M(123M) 13.902ms
[42.612s][info][gc,cpu         ] GC(18) User=0.03s Sys=0.00s Real=0.01s
[42.613s][info][gc             ] GC(18) Concurrent Mark
[42.613s][info][gc,task        ] GC(18) Using 2 workers of 2 for marking
[42.657s][info][gc             ] GC(18) Concurrent Mark 44.738ms
[42.657s][info][gc,cpu         ] GC(18) User=0.14s Sys=0.00s Real=0.04s
[42.657s][info][gc             ] GC(18) Concurrent Preclean
[42.658s][info][gc             ] GC(18) Concurrent Preclean 0.226ms
[42.658s][info][gc,cpu         ] GC(18) User=0.00s Sys=0.00s Real=0.00s
[42.658s][info][gc             ] GC(18) Concurrent Abortable Preclean
[47.685s][info][gc             ] GC(18) Concurrent Abortable Preclean 5027.696ms
[47.685s][info][gc,cpu         ] GC(18) User=5.03s Sys=0.00s Real=5.03s
[47.686s][info][gc,start       ] GC(18) Pause Remark
[47.695s][info][gc             ] GC(18) Pause Remark 91M->91M(123M) 9.155ms
[47.695s][info][gc,cpu         ] GC(18) User=0.03s Sys=0.00s Real=0.01s
[47.695s][info][gc             ] GC(18) Concurrent Sweep
[47.717s][info][gc             ] GC(18) Concurrent Sweep 21.753ms
[47.717s][info][gc,cpu         ] GC(18) User=0.03s Sys=0.00s Real=0.02s
[47.717s][info][gc             ] GC(18) Concurrent Reset
[47.717s][info][gc             ] GC(18) Concurrent Reset 0.066ms
[47.717s][info][gc,cpu         ] GC(18) User=0.00s Sys=0.00s Real=0.00s
[47.717s][info][gc,heap        ] GC(18) Old: 67011K->66064K(87424K)
[49.716s][info][gc,start       ] GC(19) Pause Initial Mark
[49.730s][info][gc             ] GC(19) Pause Initial Mark 90M->90M(123M) 13.237ms
[49.730s][info][gc,cpu         ] GC(19) User=0.02s Sys=0.00s Real=0.01s
[49.730s][info][gc             ] GC(19) Concurrent Mark
[49.730s][info][gc,task        ] GC(19) Using 2 workers of 2 for marking
[49.773s][info][gc             ] GC(19) Concurrent Mark 43.646ms
[49.774s][info][gc,cpu         ] GC(19) User=0.14s Sys=0.00s Real=0.04s
[49.774s][info][gc             ] GC(19) Concurrent Preclean
[49.774s][info][gc             ] GC(19) Concurrent Preclean 0.218ms
[49.774s][info][gc,cpu         ] GC(19) User=0.00s Sys=0.00s Real=0.00s
[49.774s][info][gc             ] GC(19) Concurrent Abortable Preclean
[54.799s][info][gc             ] GC(19) Concurrent Abortable Preclean 5025.573ms
[54.799s][info][gc,cpu         ] GC(19) User=5.02s Sys=0.00s Real=5.03s
[54.800s][info][gc,start       ] GC(19) Pause Remark
[54.808s][info][gc             ] GC(19) Pause Remark 90M->90M(123M) 8.440ms
[54.808s][info][gc,cpu         ] GC(19) User=0.03s Sys=0.00s Real=0.01s
[54.808s][info][gc             ] GC(19) Concurrent Sweep
[54.832s][info][gc             ] GC(19) Concurrent Sweep 23.707ms
[54.832s][info][gc,cpu         ] GC(19) User=0.03s Sys=0.00s Real=0.02s
[54.832s][info][gc             ] GC(19) Concurrent Reset
[54.832s][info][gc             ] GC(19) Concurrent Reset 0.068ms
[54.832s][info][gc,cpu         ] GC(19) User=0.00s Sys=0.00s Real=0.00s
[54.832s][info][gc,heap        ] GC(19) Old: 66064K->62521K(87424K)
[56.832s][info][gc,start       ] GC(20) Pause Initial Mark
[56.846s][info][gc             ] GC(20) Pause Initial Mark 87M->87M(123M) 13.267ms
[56.846s][info][gc,cpu         ] GC(20) User=0.03s Sys=0.00s Real=0.01s
[56.846s][info][gc             ] GC(20) Concurrent Mark
[56.846s][info][gc,task        ] GC(20) Using 2 workers of 2 for marking
[56.892s][info][gc             ] GC(20) Concurrent Mark 46.601ms
[56.892s][info][gc,cpu         ] GC(20) User=0.14s Sys=0.00s Real=0.05s
[56.892s][info][gc             ] GC(20) Concurrent Preclean
[56.893s][info][gc             ] GC(20) Concurrent Preclean 0.212ms
[56.893s][info][gc,cpu         ] GC(20) User=0.00s Sys=0.00s Real=0.00s
[56.893s][info][gc             ] GC(20) Concurrent Abortable Preclean
[61.920s][info][gc             ] GC(20) Concurrent Abortable Preclean 5027.542ms
[61.920s][info][gc,cpu         ] GC(20) User=5.03s Sys=0.00s Real=5.03s
[61.921s][info][gc,start       ] GC(20) Pause Remark
[61.929s][info][gc             ] GC(20) Pause Remark 87M->87M(123M) 8.328ms
[61.929s][info][gc,cpu         ] GC(20) User=0.03s Sys=0.00s Real=0.01s
[61.929s][info][gc             ] GC(20) Concurrent Sweep
[61.954s][info][gc             ] GC(20) Concurrent Sweep 24.554ms
[61.954s][info][gc,cpu         ] GC(20) User=0.03s Sys=0.00s Real=0.02s
[61.954s][info][gc             ] GC(20) Concurrent Reset
[61.954s][info][gc             ] GC(20) Concurrent Reset 0.064ms
[61.954s][info][gc,cpu         ] GC(20) User=0.00s Sys=0.00s Real=0.00s
[61.954s][info][gc,heap        ] GC(20) Old: 62521K->58411K(87424K)
[63.953s][info][gc,start       ] GC(21) Pause Initial Mark
[63.966s][info][gc             ] GC(21) Pause Initial Mark 83M->83M(123M) 12.541ms
[63.966s][info][gc,cpu         ] GC(21) User=0.02s Sys=0.00s Real=0.01s
[63.966s][info][gc             ] GC(21) Concurrent Mark
[63.966s][info][gc,task        ] GC(21) Using 2 workers of 2 for marking
[64.011s][info][gc             ] GC(21) Concurrent Mark 45.119ms
[64.011s][info][gc,cpu         ] GC(21) User=0.14s Sys=0.00s Real=0.05s
[64.011s][info][gc             ] GC(21) Concurrent Preclean
[64.012s][info][gc             ] GC(21) Concurrent Preclean 0.219ms
[64.012s][info][gc,cpu         ] GC(21) User=0.00s Sys=0.00s Real=0.00s
[64.012s][info][gc             ] GC(21) Concurrent Abortable Preclean
[69.041s][info][gc             ] GC(21) Concurrent Abortable Preclean 5029.757ms
[69.042s][info][gc,cpu         ] GC(21) User=5.03s Sys=0.00s Real=5.03s
[69.042s][info][gc,start       ] GC(21) Pause Remark
[69.050s][info][gc             ] GC(21) Pause Remark 83M->83M(123M) 8.073ms
[69.050s][info][gc,cpu         ] GC(21) User=0.00s Sys=0.00s Real=0.01s
[69.050s][info][gc             ] GC(21) Concurrent Sweep
[69.073s][info][gc             ] GC(21) Concurrent Sweep 22.945ms
[69.073s][info][gc,cpu         ] GC(21) User=0.06s Sys=0.00s Real=0.02s
[69.073s][info][gc             ] GC(21) Concurrent Reset
[69.073s][info][gc             ] GC(21) Concurrent Reset 0.062ms
[69.073s][info][gc,cpu         ] GC(21) User=0.00s Sys=0.00s Real=0.00s
[69.073s][info][gc,heap        ] GC(21) Old: 58411K->53374K(87424K)
[71.072s][info][gc,start       ] GC(22) Pause Initial Mark
[71.084s][info][gc             ] GC(22) Pause Initial Mark 78M->78M(123M) 11.719ms
[71.084s][info][gc,cpu         ] GC(22) User=0.02s Sys=0.00s Real=0.01s
[71.084s][info][gc             ] GC(22) Concurrent Mark
[71.084s][info][gc,task        ] GC(22) Using 2 workers of 2 for marking
[71.116s][info][gc             ] GC(22) Concurrent Mark 31.822ms
[71.116s][info][gc,cpu         ] GC(22) User=0.09s Sys=0.00s Real=0.03s
[71.116s][info][gc             ] GC(22) Concurrent Preclean
[71.116s][info][gc             ] GC(22) Concurrent Preclean 0.213ms
[71.117s][info][gc,cpu         ] GC(22) User=0.00s Sys=0.00s Real=0.00s
[71.117s][info][gc             ] GC(22) Concurrent Abortable Preclean
[76.143s][info][gc             ] GC(22) Concurrent Abortable Preclean 5026.809ms
[76.143s][info][gc,cpu         ] GC(22) User=5.02s Sys=0.00s Real=5.03s
[76.144s][info][gc,start       ] GC(22) Pause Remark
[76.151s][info][gc             ] GC(22) Pause Remark 78M->78M(123M) 7.531ms
[76.151s][info][gc,cpu         ] GC(22) User=0.03s Sys=0.00s Real=0.01s
[76.151s][info][gc             ] GC(22) Concurrent Sweep
[76.174s][info][gc             ] GC(22) Concurrent Sweep 22.723ms
[76.174s][info][gc,cpu         ] GC(22) User=0.03s Sys=0.00s Real=0.02s
[76.174s][info][gc             ] GC(22) Concurrent Reset
[76.174s][info][gc             ] GC(22) Concurrent Reset 0.063ms
[76.174s][info][gc,cpu         ] GC(22) User=0.00s Sys=0.00s Real=0.00s
[76.174s][info][gc,heap        ] GC(22) Old: 53374K->46699K(87424K)
[78.174s][info][gc,start       ] GC(23) Pause Initial Mark
[78.185s][info][gc             ] GC(23) Pause Initial Mark 71M->71M(123M) 10.674ms
[78.185s][info][gc,cpu         ] GC(23) User=0.03s Sys=0.00s Real=0.01s
[78.185s][info][gc             ] GC(23) Concurrent Mark
[78.185s][info][gc,task        ] GC(23) Using 2 workers of 2 for marking
[78.212s][info][gc             ] GC(23) Concurrent Mark 27.259ms
[78.213s][info][gc,cpu         ] GC(23) User=0.09s Sys=0.00s Real=0.03s
[78.213s][info][gc             ] GC(23) Concurrent Preclean
[78.213s][info][gc             ] GC(23) Concurrent Preclean 0.211ms
[78.213s][info][gc,cpu         ] GC(23) User=0.00s Sys=0.00s Real=0.00s
[78.213s][info][gc             ] GC(23) Concurrent Abortable Preclean
[79.126s][info][gc,start       ] GC(24) Pause Young (Allocation Failure)
[79.126s][info][gc,task        ] GC(24) Using 2 workers of 8 for evacuation
[79.163s][info][gc,heap        ] GC(24) ParNew: 34944K->4352K(39296K)
[79.163s][info][gc,heap        ] GC(24) CMS: 46699K->68603K(87424K)
[79.163s][info][gc,metaspace   ] GC(24) Metaspace: 2458K->2458K(1056768K)
[79.163s][info][gc             ] GC(24) Pause Young (Allocation Failure) 79M->71M(123M) 36.881ms
[79.163s][info][gc,cpu         ] GC(24) User=0.08s Sys=0.02s Real=0.04s
[79.183s][info][gc,start       ] GC(25) Pause Young (Allocation Failure)
[79.184s][info][gc,task        ] GC(25) Using 2 workers of 8 for evacuation
[79.184s][info][gc             ] GC(25) Pause Young (Allocation Failure) 105M->105M(123M) 0.132ms
[79.184s][info][gc,cpu         ] GC(25) User=0.00s Sys=0.00s Real=0.00s
[79.184s][info][gc,start       ] GC(26) Pause Full (Allocation Failure)
[79.194s][info][gc             ] GC(23) Concurrent Abortable Preclean 981.543ms
[79.194s][info][gc,cpu         ] GC(23) User=0.92s Sys=0.02s Real=0.98s
[79.195s][info][gc,phases,start] GC(26) Phase 1: Mark live objects
[79.237s][info][gc,phases      ] GC(26) Phase 1: Mark live objects 42.642ms
[79.237s][info][gc,phases,start] GC(26) Phase 2: Compute new object addresses
[79.278s][info][gc,phases      ] GC(26) Phase 2: Compute new object addresses 41.033ms
[79.278s][info][gc,phases,start] GC(26) Phase 3: Adjust pointers
[79.321s][info][gc,phases      ] GC(26) Phase 3: Adjust pointers 42.781ms
[79.321s][info][gc,phases,start] GC(26) Phase 4: Move objects
[79.346s][info][gc,phases      ] GC(26) Phase 4: Move objects 24.645ms
[79.346s][info][gc,heap        ] GC(26) ParNew: 39296K->10347K(39296K)
[79.346s][info][gc,heap        ] GC(26) CMS: 68603K->87423K(87424K)
[79.346s][info][gc,metaspace   ] GC(26) Metaspace: 2458K->2428K(1056768K)
[79.346s][info][gc             ] GC(26) Pause Full (Allocation Failure) 105M->95M(123M) 162.509ms
[79.346s][info][gc,cpu         ] GC(26) User=0.16s Sys=0.00s Real=0.16s
[79.383s][info][gc,start       ] GC(27) Pause Full (Allocation Failure)
[79.383s][info][gc,phases,start] GC(27) Phase 1: Mark live objects
[79.432s][info][gc,phases      ] GC(27) Phase 1: Mark live objects 48.832ms
[79.432s][info][gc,phases,start] GC(27) Phase 2: Compute new object addresses
[79.481s][info][gc,phases      ] GC(27) Phase 2: Compute new object addresses 48.729ms
[79.481s][info][gc,phases,start] GC(27) Phase 3: Adjust pointers
[79.526s][info][gc,phases      ] GC(27) Phase 3: Adjust pointers 45.282ms
[79.526s][info][gc,phases,start] GC(27) Phase 4: Move objects
[79.533s][info][gc,phases      ] GC(27) Phase 4: Move objects 6.982ms
[79.534s][info][gc,heap        ] GC(27) ParNew: 39295K->39208K(39296K)
[79.534s][info][gc,heap        ] GC(27) CMS: 87423K->87423K(87424K)
[79.534s][info][gc,metaspace   ] GC(27) Metaspace: 2433K->2433K(1056768K)
[79.534s][info][gc             ] GC(27) Pause Full (Allocation Failure) 123M->123M(123M) 150.444ms
[79.534s][info][gc,cpu         ] GC(27) User=0.14s Sys=0.00s Real=0.15s
[79.534s][info][gc,start       ] GC(28) Pause Initial Mark
[79.544s][info][gc             ] GC(28) Pause Initial Mark 123M->123M(123M) 9.545ms
[79.544s][info][gc,cpu         ] GC(28) User=0.02s Sys=0.00s Real=0.01s
[79.544s][info][gc             ] GC(28) Concurrent Mark
[79.544s][info][gc,task        ] GC(28) Using 2 workers of 2 for marking
[79.544s][info][gc,start       ] GC(29) Pause Full (Allocation Failure)
[79.648s][info][gc             ] GC(28) Concurrent Mark 104.218ms
[79.648s][info][gc,cpu         ] GC(28) User=0.22s Sys=0.00s Real=0.10s
[79.648s][info][gc,phases,start] GC(29) Phase 1: Mark live objects
[79.697s][info][gc,phases      ] GC(29) Phase 1: Mark live objects 48.943ms
[79.697s][info][gc,phases,start] GC(29) Phase 2: Compute new object addresses
[79.745s][info][gc,phases      ] GC(29) Phase 2: Compute new object addresses 48.227ms
[79.745s][info][gc,phases,start] GC(29) Phase 3: Adjust pointers
[79.790s][info][gc,phases      ] GC(29) Phase 3: Adjust pointers 44.415ms
[79.790s][info][gc,phases,start] GC(29) Phase 4: Move objects
[79.790s][info][gc,phases      ] GC(29) Phase 4: Move objects 0.038ms
[79.790s][info][gc,heap        ] GC(29) ParNew: 39295K->39291K(39296K)
[79.790s][info][gc,heap        ] GC(29) CMS: 87423K->87423K(87424K)
[79.790s][info][gc,metaspace   ] GC(29) Metaspace: 2433K->2433K(1056768K)
[79.790s][info][gc             ] GC(29) Pause Full (Allocation Failure) 123M->123M(123M) 245.577ms
[79.790s][info][gc,cpu         ] GC(29) User=0.36s Sys=0.00s Real=0.25s
[79.790s][info][gc,start       ] GC(30) Pause Full (Allocation Failure)
[79.791s][info][gc,phases,start] GC(30) Phase 1: Mark live objects
[79.840s][info][gc,phases      ] GC(30) Phase 1: Mark live objects 49.422ms
[79.840s][info][gc,phases,start] GC(30) Phase 2: Compute new object addresses
[79.889s][info][gc,phases      ] GC(30) Phase 2: Compute new object addresses 48.761ms
[79.889s][info][gc,phases,start] GC(30) Phase 3: Adjust pointers
[79.932s][info][gc,phases      ] GC(30) Phase 3: Adjust pointers 43.581ms
[79.932s][info][gc,phases,start] GC(30) Phase 4: Move objects
[79.932s][info][gc,phases      ] GC(30) Phase 4: Move objects 0.033ms
[79.933s][info][gc,heap        ] GC(30) ParNew: 39296K->39295K(39296K)
[79.933s][info][gc,heap        ] GC(30) CMS: 87424K->87424K(87424K)
[79.933s][info][gc,metaspace   ] GC(30) Metaspace: 2433K->2433K(1056768K)
[79.933s][info][gc             ] GC(30) Pause Full (Allocation Failure) 123M->123M(123M) 142.345ms
[79.933s][info][gc,cpu         ] GC(30) User=0.14s Sys=0.00s Real=0.14s
[79.933s][info][gc,start       ] GC(31) Pause Full (Allocation Failure)
[79.933s][info][gc,phases,start] GC(31) Phase 1: Mark live objects
[79.987s][info][gc,phases      ] GC(31) Phase 1: Mark live objects 53.575ms
[79.987s][info][gc,phases,start] GC(31) Phase 2: Compute new object addresses
[80.035s][info][gc,phases      ] GC(31) Phase 2: Compute new object addresses 48.208ms
[80.035s][info][gc,phases,start] GC(31) Phase 3: Adjust pointers
[80.080s][info][gc,phases      ] GC(31) Phase 3: Adjust pointers 44.669ms
[80.080s][info][gc,phases,start] GC(31) Phase 4: Move objects
[80.080s][info][gc,phases      ] GC(31) Phase 4: Move objects 0.020ms
[80.080s][info][gc,heap        ] GC(31) ParNew: 39296K->39296K(39296K)
[80.080s][info][gc,heap        ] GC(31) CMS: 87424K->87424K(87424K)
[80.080s][info][gc,metaspace   ] GC(31) Metaspace: 2433K->2433K(1056768K)
[80.080s][info][gc             ] GC(31) Pause Full (Allocation Failure) 123M->123M(123M) 146.985ms
[80.080s][info][gc,cpu         ] GC(31) User=0.14s Sys=0.00s Real=0.15s
[80.080s][info][gc,start       ] GC(32) Pause Full (Allocation Failure)
[80.080s][info][gc,phases,start] GC(32) Phase 1: Mark live objects
[80.129s][info][gc,phases      ] GC(32) Phase 1: Mark live objects 48.714ms
[80.129s][info][gc,phases,start] GC(32) Phase 2: Compute new object addresses
[80.180s][info][gc,phases      ] GC(32) Phase 2: Compute new object addresses 51.529ms
[80.180s][info][gc,phases,start] GC(32) Phase 3: Adjust pointers
[80.229s][info][gc,phases      ] GC(32) Phase 3: Adjust pointers 48.228ms
[80.229s][info][gc,phases,start] GC(32) Phase 4: Move objects
[80.266s][info][gc,phases      ] GC(32) Phase 4: Move objects 37.027ms
[80.266s][info][gc,heap        ] GC(32) ParNew: 39296K->39292K(39296K)
[80.266s][info][gc,heap        ] GC(32) CMS: 87424K->87423K(87424K)
[80.266s][info][gc,metaspace   ] GC(32) Metaspace: 2433K->2433K(1056768K)
[80.266s][info][gc             ] GC(32) Pause Full (Allocation Failure) 123M->123M(123M) 186.013ms
[80.266s][info][gc,cpu         ] GC(32) User=0.19s Sys=0.00s Real=0.19s
[80.266s][info][gc,start       ] GC(33) Pause Initial Mark
[80.276s][info][gc             ] GC(33) Pause Initial Mark 123M->123M(123M) 9.561ms
[80.276s][info][gc,cpu         ] GC(33) User=0.02s Sys=0.00s Real=0.01s
[80.276s][info][gc             ] GC(33) Concurrent Mark
[80.276s][info][gc,task        ] GC(33) Using 2 workers of 2 for marking
[80.276s][info][gc,start       ] GC(34) Pause Full (Allocation Failure)
[80.379s][info][gc             ] GC(33) Concurrent Mark 102.789ms
[80.379s][info][gc,cpu         ] GC(33) User=0.19s Sys=0.00s Real=0.10s
[80.379s][info][gc,phases,start] GC(34) Phase 1: Mark live objects
[80.428s][info][gc,phases      ] GC(34) Phase 1: Mark live objects 49.057ms
[80.428s][info][gc,phases,start] GC(34) Phase 2: Compute new object addresses
[80.475s][info][gc,phases      ] GC(34) Phase 2: Compute new object addresses 47.098ms
[80.475s][info][gc,phases,start] GC(34) Phase 3: Adjust pointers
[80.518s][info][gc,phases      ] GC(34) Phase 3: Adjust pointers 42.943ms
[80.518s][info][gc,phases,start] GC(34) Phase 4: Move objects
[80.518s][info][gc,phases      ] GC(34) Phase 4: Move objects 0.021ms
[80.518s][info][gc,heap        ] GC(34) ParNew: 39296K->39296K(39296K)
[80.518s][info][gc,heap        ] GC(34) CMS: 87423K->87423K(87424K)
[80.518s][info][gc,metaspace   ] GC(34) Metaspace: 2433K->2433K(1056768K)
[80.518s][info][gc             ] GC(34) Pause Full (Allocation Failure) 123M->123M(123M) 242.197ms
[80.518s][info][gc,cpu         ] GC(34) User=0.33s Sys=0.00s Real=0.24s
[80.518s][info][gc,start       ] GC(35) Pause Full (Allocation Failure)
[80.518s][info][gc,phases,start] GC(35) Phase 1: Mark live objects
[80.568s][info][gc,phases      ] GC(35) Phase 1: Mark live objects 49.644ms
[80.568s][info][gc,phases,start] GC(35) Phase 2: Compute new object addresses
[80.618s][info][gc,phases      ] GC(35) Phase 2: Compute new object addresses 49.493ms
[80.618s][info][gc,phases,start] GC(35) Phase 3: Adjust pointers
[80.661s][info][gc,phases      ] GC(35) Phase 3: Adjust pointers 43.615ms
[80.661s][info][gc,phases,start] GC(35) Phase 4: Move objects
[80.661s][info][gc,phases      ] GC(35) Phase 4: Move objects 0.020ms
[80.662s][info][gc,heap        ] GC(35) ParNew: 39296K->39296K(39296K)
[80.662s][info][gc,heap        ] GC(35) CMS: 87423K->87423K(87424K)
[80.662s][info][gc,metaspace   ] GC(35) Metaspace: 2433K->2433K(1056768K)
[80.662s][info][gc             ] GC(35) Pause Full (Allocation Failure) 123M->123M(123M) 143.503ms
[80.662s][info][gc,cpu         ] GC(35) User=0.16s Sys=0.00s Real=0.14s
[80.662s][info][gc,start       ] GC(36) Pause Full (Allocation Failure)
[80.662s][info][gc,phases,start] GC(36) Phase 1: Mark live objects
[80.711s][info][gc,phases      ] GC(36) Phase 1: Mark live objects 48.326ms
[80.711s][info][gc,phases,start] GC(36) Phase 2: Compute new object addresses
[80.762s][info][gc,phases      ] GC(36) Phase 2: Compute new object addresses 51.542ms
[80.762s][info][gc,phases,start] GC(36) Phase 3: Adjust pointers
[80.810s][info][gc,phases      ] GC(36) Phase 3: Adjust pointers 47.648ms
[80.810s][info][gc,phases,start] GC(36) Phase 4: Move objects
[80.839s][info][gc,phases      ] GC(36) Phase 4: Move objects 29.476ms
[80.840s][info][gc,heap        ] GC(36) ParNew: 39296K->39294K(39296K)
[80.840s][info][gc,heap        ] GC(36) CMS: 87423K->87423K(87424K)
[80.840s][info][gc,metaspace   ] GC(36) Metaspace: 2433K->2433K(1056768K)
[80.840s][info][gc             ] GC(36) Pause Full (Allocation Failure) 123M->123M(123M) 177.516ms
[80.840s][info][gc,cpu         ] GC(36) User=0.17s Sys=0.00s Real=0.18s
[80.840s][info][gc,start       ] GC(37) Pause Full (Allocation Failure)
[80.840s][info][gc,phases,start] GC(37) Phase 1: Mark live objects
[80.842s][info][gc,phases      ] GC(37) Phase 1: Mark live objects 1.631ms
[80.842s][info][gc,phases,start] GC(37) Phase 2: Compute new object addresses
[80.871s][info][gc,phases      ] GC(37) Phase 2: Compute new object addresses 29.259ms
[80.871s][info][gc,phases,start] GC(37) Phase 3: Adjust pointers
[80.872s][info][gc,phases      ] GC(37) Phase 3: Adjust pointers 1.359ms
[80.872s][info][gc,phases,start] GC(37) Phase 4: Move objects
[80.873s][info][gc,phases      ] GC(37) Phase 4: Move objects 0.434ms
[80.873s][info][gc,heap        ] GC(37) ParNew: 39295K->0K(39296K)
[80.873s][info][gc,heap        ] GC(37) CMS: 87423K->1725K(87424K)
[80.873s][info][gc,metaspace   ] GC(37) Metaspace: 2433K->2433K(1056768K)
[80.873s][info][gc             ] GC(37) Pause Full (Allocation Failure) 123M->1M(123M) 33.088ms
[80.873s][info][gc,cpu         ] GC(37) User=0.03s Sys=0.00s Real=0.03s
[80.874s][info][gc,heap,exit   ] Heap
[80.874s][info][gc,heap,exit   ]  par new generation   total 39296K, used 1086K [0x00000000f8000000, 0x00000000faaa0000, 0x00000000faaa0000)
[80.875s][info][gc,heap,exit   ]   eden space 34944K,   3% used [0x00000000f8000000, 0x00000000f810fa40, 0x00000000fa220000)
[80.875s][info][gc,heap,exit   ]   from space 4352K,   0% used [0x00000000fa220000, 0x00000000fa220000, 0x00000000fa660000)
[80.875s][info][gc,heap,exit   ]   to   space 4352K,   0% used [0x00000000fa660000, 0x00000000fa660000, 0x00000000faaa0000)
[80.875s][info][gc,heap,exit   ]  concurrent mark-sweep generation total 87424K, used 1725K [0x00000000faaa0000, 0x0000000100000000, 0x0000000100000000)
[80.875s][info][gc,heap,exit   ]  Metaspace       used 2445K, capacity 4748K, committed 4864K, reserved 1056768K
[80.875s][info][gc,heap,exit   ]   class space    used 266K, capacity 452K, committed 512K, reserved 1048576K

```

</details>
VMOptions: ```-Xmx128m -Xms128m -Xloggc:gc_cms.log -XX:+PrintGCDetails -XX:+UseConcMarkSweepGC```


| param / GC | G1 | SerialGC | ParallelGC | CMS
| --- | --- | --- | --- | --- |
| avgPause | 0,02108s | 0,0807s | 0, 0386s | 0,04332s
| minPause | 0,0001s | 0,0001s | 0,0001s | 0,00013s
| maxPause | 0,08143s | 0,15968s | 0,25522s |0,24558s
| accumPause | 0,97s | 1,53s | 2,24s | 2,38s
| throughput | 98,88% | 98,06% | 97,23% | 96,95%
| uptime | 1m 26s | 1m 19s | 1m 20s | 1m 18s

Conclusion: the best GC for this task is G1 due to high throughput and low pause time. However, the 
most important parameter for this task, is an ability to utilize resources fast, in order to avoid the 
out of memory exception. Based on this condition, we should rely on uptime parameter. The G1 shows the 
best uptime among other GC collectors. 