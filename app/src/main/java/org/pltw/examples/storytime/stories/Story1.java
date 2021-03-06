package org.pltw.examples.storytime.stories;

import android.util.Log;

import org.pltw.examples.storytime.R;
import org.pltw.examples.storytime.Stage;

import java.util.ArrayList;

public class Story1 extends Story {
    private static Story1 story1;


    private static int INT = 0;
    private static int ATH = 2;
    private static int MUS = 1;
    private static Stage initial;
    private static ArrayList<Stage> intelligent;
    private static ArrayList<Stage> athletic;
    private static ArrayList<Stage> musical;
    private android.content.Context context;
    private String name = "Life of Braeden";

    private Story1() {
        super();
        intelligent = new ArrayList<>();
        athletic = new ArrayList<>();
        musical = new ArrayList<>();
        initial = new Stage(-1, R.string.story1_main_text,  R.string.story1_option1,  R.string.story1_option2,  R.string.story1_option3, 0, 1, 2, 3);//MAKE THIS THE INTRO FOR ALL PATHS

        //vvvvvvvvvvvvvvvvvv PUT STAGES HERE vvvvvvvvvvvvvvvvvv
        Stage ath0 = new Stage(ATH, R.string.ath0_main_text, R.string.ath0_option1, R.string.ath0_option2, R.string.ath0_option3, 0, 1, 1, 1);
        Stage ath1 = new Stage(ATH, R.string.ath1_main_text, R.string.ath1_option1, R.string.ath1_option2, R.string.ath1_option3, 1, 2, 3, 4);
        Stage ath2 = new Stage(ATH, R.string.ath2_main_text, R.string.ath2_option1, R.string.ath2_option2, R.string.ath2_option3, 2, -1, -1, -1);
        Stage ath3 = new Stage(ATH, R.string.ath3_main_text, R.string.ath3_option1, R.string.ath3_option2, R.string.ath3_option3, 3, -1, -1, -1);
        Stage ath4 = new Stage(ATH, R.string.ath4_main_text, R.string.ath4_option1, R.string.ath4_option2, R.string.ath4_option3, 4, -1, -1, -1);

        //vvvvvvvvvvvvvvvvvv INT Stages vvvvvvvvvvvvvvvvvv
        Stage int0 = new Stage(INT, R.string.int0_main_text, R.string.int0_option1, R.string.int0_option2, R.string.int0_option3, 0, 1, 2, 3);
        Stage int1 = new Stage(INT, R.string.int1_main_text, R.string.int1_option1, R.string.int1_option2, R.string.int1_option3, 1, 4, 5, 6);
        Stage int2 = new Stage(INT, R.string.int2_main_text, R.string.int2_option1, R.string.int2_option2, R.string.int2_option3, 2, 1, 7, 7);
        Stage int3 = new Stage(INT, R.string.int3_main_text, R.string.int3_option1, R.string.int3_option2, R.string.int3_option3, 3, 8, 9, 10);
        Stage int4 = new Stage(INT, R.string.int4_main_text, R.string.int4_option1, R.string.int4_option2, R.string.int4_option3, 4, 11, 12, 11);
        Stage int5 = new Stage(INT, R.string.int5_main_text, R.string.int5_option1, R.string.int5_option2, R.string.int5_option3, 5, 13, 4, 6);
        Stage int6 = new Stage(INT, R.string.int6_main_text, R.string.int6_option1, R.string.int6_option2, R.string.int6_option3, 6, 4, 5, 13);
        Stage int7 = new Stage(INT, R.string.int7_main_text, R.string.int7_option1, R.string.int7_option2, R.string.int7_option3, 7, 1, 3, -1 );
        Stage int8 = new Stage(INT, R.string.int8_main_text, R.string.int8_option1, R.string.int8_option2, R.string.int8_option3, 8, 1, 3, 2);
        Stage int9 = new Stage(INT, R.string.int9_main_text, R.string.int9_option1, R.string.int9_option2, R.string.int9_option3, 9, 1, 3, 2);
        Stage int10 = new Stage(INT, R.string.int10_main_text, R.string.int10_option1, R.string.int10_option2, R.string.int10_option3, 10, 1, 3, 2);
        Stage int11 = new Stage(INT, R.string.int11_main_text, R.string.int11_option1, R.string.int11_option2, R.string.int11_option3, 11, 14, 5, 6);
        Stage int12 = new Stage(INT, R.string.int12_main_text, R.string.int12_option1, R.string.int12_option2, R.string.int12_option3, 12, 5, 15, -1);
        Stage int13 = new Stage(INT, R.string.int13_main_text, R.string.int13_option1, R.string.int13_option2, R.string.int13_option3, 13, 4, 15, -1);
        Stage int14 = new Stage(INT, R.string.int14_main_text, R.string.int14_option1, R.string.int14_option2, R.string.int14_option3, 14, 5, 15, -1);
        Stage int15 = new Stage(INT, R.string.int15_main_text, R.string.int15_option1, R.string.int15_option2, R.string.int15_option3, 15, 16, 16, 16);
        Stage int16 = new Stage(INT, R.string.int16_main_text, R.string.int16_option1, R.string.int16_option2, R.string.int16_option3, 16, 17, 18, 19);
        Stage int17 = new Stage(INT, R.string.int17_main_text, R.string.int17_option1, R.string.int17_option2, R.string.int17_option3, 17, 20, 21, 21);
        Stage int18 = new Stage(INT, R.string.int18_main_text, R.string.int18_option1, R.string.int18_option2, R.string.int18_option3, 18, 22, 17, 19);
        Stage int19 = new Stage(INT, R.string.int19_main_text, R.string.int19_option1, R.string.int19_option2, R.string.int19_option3, 19, -1, -1, -1);
        Stage int20 = new Stage(INT, R.string.int20_main_text, R.string.int20_option1, R.string.int20_option2, R.string.int20_option3, 20, 23, 24, 25);
        Stage int21 = new Stage(INT, R.string.int21_main_text, R.string.int21_option1, R.string.int21_option2, R.string.int21_option3, 21, 26, 27, 27);
        Stage int22 = new Stage(INT, R.string.int22_main_text, R.string.int22_option1, R.string.int22_option2, R.string.int22_option3, 22, 28, 29, 30);
        Stage int23 = new Stage(INT, R.string.int23_main_text, R.string.int23_option1, R.string.int23_option2, R.string.int23_option3, 23, 31, 32, 34);
        Stage int24 = new Stage(INT, R.string.int24_main_text, R.string.int24_option1, R.string.int24_option2, R.string.int24_option3, 24, 35, 36, 37);
        Stage int25 = new Stage(INT, R.string.int25_main_text, R.string.int25_option1, R.string.int25_option2, R.string.int25_option3, 25, 33, 23, -1);
        Stage int26 = new Stage(INT, R.string.int26_main_text, R.string.int26_option1, R.string.int26_option2, R.string.int26_option3, 26, 23, 24, 25);
        Stage int27 = new Stage(INT, R.string.int27_main_text, R.string.int27_option1, R.string.int27_option2, R.string.int27_option3, 27, -1, -1, -1);
        Stage int28 = new Stage(INT, R.string.int28_main_text, R.string.int28_option1, R.string.int28_option2, R.string.int28_option3, 28, 23, 25, 34);
        Stage int29 = new Stage(INT, R.string.int29_main_text, R.string.int29_option1, R.string.int29_option2, R.string.int29_option3, 29, 23, 25, 34);
        Stage int30 = new Stage(INT, R.string.int30_main_text, R.string.int30_option1, R.string.int30_option2, R.string.int30_option3, 30, 23, 24, 25);
        Stage int31 = new Stage(INT, R.string.int31_main_text, R.string.int31_option1, R.string.int31_option2, R.string.int31_option3, 31, 34, 38, 38);
        Stage int32 = new Stage(INT, R.string.int32_main_text, R.string.int32_option1, R.string.int32_option2, R.string.int32_option3, 32, 39, 40, 41);
        Stage int33 = new Stage(INT, R.string.int33_main_text, R.string.int33_option1, R.string.int33_option2, R.string.int33_option3, 33, 31, 32, 34);
        Stage int34 = new Stage(INT, R.string.int34_main_text, R.string.int34_option1, R.string.int34_option2, R.string.int34_option3, 34, 42, 43, 44);
        Stage int35 = new Stage(INT, R.string.int35_main_text, R.string.int35_option1, R.string.int35_option2, R.string.int35_option3, 35, 45, 46, 46);
        Stage int36 = new Stage(INT, R.string.int36_main_text, R.string.int36_option1, R.string.int36_option2, R.string.int36_option3, 36, 39, 47, 48);
        Stage int37 = new Stage(INT, R.string.int37_main_text, R.string.int37_option1, R.string.int37_option2, R.string.int37_option3, 37, 49, 50, 51);
        Stage int38 = new Stage(INT, R.string.int38_main_text, R.string.int38_option1, R.string.int38_option2, R.string.int38_option3, 38, 52, 53, 54);
        Stage int39 = new Stage(INT, R.string.int39_main_text, R.string.int39_option1, R.string.int39_option2, R.string.int39_option3, 39, -1, 32, 38);
        Stage int40 = new Stage(INT, R.string.int40_main_text, R.string.int40_option1, R.string.int40_option2, R.string.int40_option3, 40, 34, 38, 38);
        Stage int41 = new Stage(INT, R.string.int41_main_text, R.string.int41_option1, R.string.int41_option2, R.string.int41_option3, 41, 55, 56, 34);
        Stage int42 = new Stage(INT, R.string.int42_main_text, R.string.int42_option1, R.string.int42_option2, R.string.int42_option3, 42, 57, 58, -1);
        Stage int43 = new Stage(INT, R.string.int43_main_text, R.string.int43_option1, R.string.int43_option2, R.string.int43_option3, 43, 59, 58, -1);
        Stage int44 = new Stage(INT, R.string.int44_main_text, R.string.int44_option1, R.string.int44_option2, R.string.int44_option3, 44, 60, 58, -1);
        Stage int45 = new Stage(INT, R.string.int45_main_text, R.string.int45_option1, R.string.int45_option2, R.string.int45_option3, 45, 49, 50, 51);
        Stage int46 = new Stage(INT, R.string.int46_main_text, R.string.int46_option1, R.string.int46_option2, R.string.int46_option3, 46, 52, 62, 63);
        Stage int47 = new Stage(INT, R.string.int47_main_text, R.string.int47_option1, R.string.int47_option2, R.string.int47_option3, 47, 45, 46, 46);
        Stage int48 = new Stage(INT, R.string.int48_main_text, R.string.int48_option1, R.string.int48_option2, R.string.int48_option3, 48, 52, 62, 63);
        Stage int49 = new Stage(INT, R.string.int49_main_text, R.string.int49_option1, R.string.int49_option2, R.string.int49_option3, 49, 165, 164, -1);
        Stage int50 = new Stage(INT, R.string.int50_main_text, R.string.int50_option1, R.string.int50_option2, R.string.int50_option3, 50, 66, 64, -1);
        Stage int51 = new Stage(INT, R.string.int51_main_text, R.string.int51_option1, R.string.int51_option2, R.string.int51_option3, 51, 67, 64, -1);
        Stage int52 = new Stage(INT, R.string.int52_main_text, R.string.int52_option1, R.string.int52_option2, R.string.int52_option3, 52, -1, -1, -1);
        Stage int53 = new Stage(INT, R.string.int53_main_text, R.string.int53_option1, R.string.int53_option2, R.string.int53_option3, 53, 73, 75, -1);
        Stage int54 = new Stage(INT, R.string.int54_main_text, R.string.int54_option1, R.string.int54_option2, R.string.int54_option3, 54, 68, 69, 38);
        Stage int55 = new Stage(INT, R.string.int55_main_text, R.string.int55_option1, R.string.int55_option2, R.string.int55_option3, 55, 70, 71, 70);
        Stage int56 = new Stage(INT, R.string.int56_main_text, R.string.int56_option1, R.string.int56_option2, R.string.int56_option3, 56, 34, 38, 38);
        Stage int57 = new Stage(INT, R.string.int57_main_text, R.string.int57_option1, R.string.int57_option2, R.string.int57_option3, 57, 61, 72, 58);//The values were set to 161, 172, and 158
        Stage int58 = new Stage(INT, R.string.int58_main_text, R.string.int58_option1, R.string.int58_option2, R.string.int58_option3, 58, 73, 75, -1);
        Stage int59 = new Stage(INT, R.string.int59_main_text, R.string.int59_option1, R.string.int59_option2, R.string.int59_option3, 59, 61, 72, 58);
        Stage int60 = new Stage(INT, R.string.int60_main_text, R.string.int60_option1, R.string.int60_option2, R.string.int60_option3, 60, 61, 72, 58);
        Stage int61 = new Stage(INT, R.string.int61_main_text, R.string.int61_option1, R.string.int61_option2, R.string.int61_option3, 61, -1, -1, -1);
        Stage int62 = new Stage(INT, R.string.int62_main_text, R.string.int62_option1, R.string.int62_option2, R.string.int62_option3, 62, 76, 91, -1);
        Stage int63 = new Stage(INT, R.string.int63_main_text, R.string.int63_option1, R.string.int63_option2, R.string.int63_option3, 63, 76, 91, -1);
        Stage int64 = new Stage(INT, R.string.int64_main_text, R.string.int64_option1, R.string.int64_option2, R.string.int64_option3, 64, 76, 91, -1);
        Stage int65 = new Stage(INT, R.string.int65_main_text, R.string.int65_option1, R.string.int65_option2, R.string.int65_option3, 65, 61, 74, 64);
        Stage int66 = new Stage(INT, R.string.int66_main_text, R.string.int66_option1, R.string.int66_option2, R.string.int66_option3, 66, 61, 74, 64);
        Stage int67 = new Stage(INT, R.string.int67_main_text, R.string.int67_option1, R.string.int67_option2, R.string.int67_option3, 67, 61, 74, 64);
        Stage int68 = new Stage(INT, R.string.int68_main_text, R.string.int68_option1, R.string.int68_option2, R.string.int68_option3, 68, 73, 75, -1);
        Stage int69 = new Stage(INT, R.string.int69_main_text, R.string.int69_option1, R.string.int69_option2, R.string.int69_option3, 69, 73, 75, -1);
        Stage int70 = new Stage(INT, R.string.int70_main_text, R.string.int70_option1, R.string.int70_option2, R.string.int70_option3, 70, 34, 38, 38);
        Stage int71 = new Stage(INT, R.string.int71_main_text, R.string.int71_option1, R.string.int71_option2, R.string.int71_option3, 71, 52, 62, 63);
        Stage int72 = new Stage(INT, R.string.int72_main_text, R.string.int72_option1, R.string.int72_option2, R.string.int72_option3, 72, 77, 91, -1);
        Stage int73 = new Stage(INT, R.string.int73_main_text, R.string.int73_option1, R.string.int73_option2, R.string.int73_option3, 73, 90, 90, 79);
        Stage int74 = new Stage(INT, R.string.int74_main_text, R.string.int74_option1, R.string.int74_option2, R.string.int74_option3, 74, 78, 91, -1);
        Stage int75 = new Stage(INT, R.string.int75_main_text, R.string.int75_option1, R.string.int75_option2, R.string.int75_option3, 75, 92, 91, -1);
        Stage int76 = new Stage(INT, R.string.int76_main_text, R.string.int76_option1, R.string.int76_option2, R.string.int76_option3, 76, 90, 90, 80);
        Stage int77 = new Stage(INT, R.string.int77_main_text, R.string.int77_option1, R.string.int77_option2, R.string.int77_option3, 77, 90, 90, 81);
        Stage int78 = new Stage(INT, R.string.int78_main_text, R.string.int78_option1, R.string.int78_option2, R.string.int78_option3, 78, 90, 90, 82);
        Stage int79 = new Stage(INT, R.string.int79_main_text, R.string.int79_option1, R.string.int79_option2, R.string.int79_option3, 79, 83, 83, 83);
        Stage int80 = new Stage(INT, R.string.int80_main_text, R.string.int80_option1, R.string.int80_option2, R.string.int80_option3, 80, 84, 84, 84);
        Stage int81 = new Stage(INT, R.string.int81_main_text, R.string.int81_option1, R.string.int81_option2, R.string.int81_option3, 81, 85, 85, 85);
        Stage int82 = new Stage(INT, R.string.int82_main_text, R.string.int82_option1, R.string.int82_option2, R.string.int82_option3, 82, 86, 86, 86);
        Stage int83 = new Stage(INT, R.string.int83_main_text, R.string.int83_option1, R.string.int83_option2, R.string.int83_option3, 83, 87, 88, 89);
        Stage int84 = new Stage(INT, R.string.int84_main_text, R.string.int84_option1, R.string.int84_option2, R.string.int84_option3, 84, 95, 88, 89);
        Stage int85 = new Stage(INT, R.string.int85_main_text, R.string.int85_option1, R.string.int85_option2, R.string.int85_option3, 85, 94, 88, 97);
        Stage int86 = new Stage(INT, R.string.int86_main_text, R.string.int86_option1, R.string.int86_option2, R.string.int86_option3, 86, 95, 96, 98);
        Stage int87 = new Stage(INT, R.string.int87_main_text, R.string.int87_option1, R.string.int87_option2, R.string.int87_option3, 87, -1, -1, -1);
        Stage int88 = new Stage(INT, R.string.int88_main_text, R.string.int88_option1, R.string.int88_option2, R.string.int88_option3, 88, -1, -1, -1);
        Stage int89 = new Stage(INT, R.string.int89_main_text, R.string.int89_option1, R.string.int89_option2, R.string.int89_option3, 89, -1, -1, -1);
        Stage int90 = new Stage(INT, R.string.int90_main_text, R.string.int90_option1, R.string.int90_option2, R.string.int90_option3, 90, -1, -1, -1);
        Stage int91 = new Stage(INT, R.string.int91_main_text, R.string.int91_option1, R.string.int91_option2, R.string.int91_option3, 91, -1, -1, -1);
        Stage int92 = new Stage(INT, R.string.int92_main_text, R.string.int92_option1, R.string.int92_option2, R.string.int92_option3, 92, 90, 90, 93);
        Stage int93 = new Stage(INT, R.string.int93_main_text, R.string.int93_option1, R.string.int93_option2, R.string.int93_option3, 93, 83, 83, 83);
        Stage int94 = new Stage(INT, R.string.int94_main_text, R.string.int94_option1, R.string.int94_option2, R.string.int94_option3, 94, -1, -1, -1);
        Stage int95 = new Stage(INT, R.string.int95_main_text, R.string.int95_option1, R.string.int95_option2, R.string.int95_option3, 95, -1, -1, -1);
        Stage int96 = new Stage(INT, R.string.int96_main_text, R.string.int96_option1, R.string.int96_option2, R.string.int96_option3, 96, -1, -1, -1);
        Stage int97 = new Stage(INT, R.string.int97_main_text, R.string.int97_option1, R.string.int97_option2, R.string.int97_option3, 97, -1, -1, -1);
        Stage int98 = new Stage(INT, R.string.int98_main_text, R.string.int98_option1, R.string.int98_option2, R.string.int98_option3, 98, -1, -1, -1);


//vvvvvvvvvvvvvvvvvv MUS Stages vvvvvvvvvvvvvvvvvv
        Stage mus0 = new Stage(MUS, R.string.mus0_main_text, R.string.mus0_option1, R.string.mus0_option2, R.string.mus0_option3, 0, 1, 1, 1);
        Stage mus1 = new Stage(MUS, R.string.mus1_main_text, R.string.mus1_option1, R.string.mus1_option2, R.string.mus1_option3, 1, 2, 2, 2);
        Stage mus2 = new Stage(MUS, R.string.mus2_main_text, R.string.mus2_option1, R.string.mus2_option2, R.string.mus2_option3, 2, 3, 3, 3);
        Stage mus3 = new Stage(MUS, R.string.mus3_main_text, R.string.mus3_option1, R.string.mus3_option2, R.string.mus3_option3, 3, 4, 5, 6);
        Stage mus4 = new Stage(MUS, R.string.mus4_main_text, R.string.mus4_option1, R.string.mus4_option2, R.string.mus4_option3, 4, 9, 11, 8);
        Stage mus5 = new Stage(MUS, R.string.mus5_main_text, R.string.mus5_option1, R.string.mus5_option2, R.string.mus5_option3, 5, 9, 10, 8);
        Stage mus6 = new Stage(MUS, R.string.mus6_main_text, R.string.mus6_option1, R.string.mus6_option2, R.string.mus6_option3, 6, 4, 7, 8);
        Stage mus7 = new Stage(MUS, R.string.mus7_main_text, R.string.mus7_option1, R.string.mus7_option2, R.string.mus7_option3, 7, 12, 13, 8);
        Stage mus8 = new Stage(MUS, R.string.mus8_main_text, R.string.mus8_option1, R.string.mus8_option2, R.string.mus8_option3, 8, 14, 14, 16);
        Stage mus9 = new Stage(MUS, R.string.mus9_main_text, R.string.mus9_option1, R.string.mus9_option2, R.string.mus9_option3, 9, 18, 19, 15);
        Stage mus10 = new Stage(MUS, R.string.mus10_main_text, R.string.mus10_option1, R.string.mus10_option2, R.string.mus10_option3, 10, 17, 14, 16);
        Stage mus11 = new Stage(MUS, R.string.mus11_main_text, R.string.mus11_option1, R.string.mus11_option2, R.string.mus11_option3, 11, 22, 18, 19);
        Stage mus12 = new Stage(MUS, R.string.mus12_main_text, R.string.mus12_option1, R.string.mus12_option2, R.string.mus12_option3, 12, 9, 10, 8);
        Stage mus13 = new Stage(MUS, R.string.mus13_main_text, R.string.mus13_option1, R.string.mus13_option2, R.string.mus13_option3, 13, 20, 21, 23);
        Stage mus14 = new Stage(MUS, R.string.mus14_main_text, R.string.mus14_option1, R.string.mus14_option2, R.string.mus14_option3, 14, 19, 19, 24);
        Stage mus15 = new Stage(MUS, R.string.mus15_main_text, R.string.mus15_option1, R.string.mus15_option2, R.string.mus15_option3, 15, 31, 31, 31);
        Stage mus16 = new Stage(MUS, R.string.mus16_main_text, R.string.mus16_option1, R.string.mus16_option2, R.string.mus16_option3, 16, -1, -1, -1);
        Stage mus17 = new Stage(MUS, R.string.mus17_main_text, R.string.mus17_option1, R.string.mus17_option2, R.string.mus17_option3, 17, 25, 19, 16);
        Stage mus18 = new Stage(MUS, R.string.mus18_main_text, R.string.mus18_option1, R.string.mus18_option2, R.string.mus18_option3, 18, 26, 27, 28);
        Stage mus19 = new Stage(MUS, R.string.mus19_main_text, R.string.mus19_option1, R.string.mus19_option2, R.string.mus19_option3, 19, 29, 34, 29);
        Stage mus20 = new Stage(MUS, R.string.mus20_main_text, R.string.mus20_option1, R.string.mus20_option2, R.string.mus20_option3, 20, 21, 23, 16);
        Stage mus21 = new Stage(MUS, R.string.mus21_main_text, R.string.mus21_option1, R.string.mus21_option2, R.string.mus21_option3, 21, 19, 19, 19);
        Stage mus22 = new Stage(MUS, R.string.mus22_main_text, R.string.mus22_option1, R.string.mus22_option2, R.string.mus22_option3, 22, 30, 29, 30);
        Stage mus23 = new Stage(MUS, R.string.mus23_main_text, R.string.mus23_option1, R.string.mus23_option2, R.string.mus23_option3, 23, 32, 34, 36);
        Stage mus24 = new Stage(MUS, R.string.mus24_main_text, R.string.mus24_option1, R.string.mus24_option2, R.string.mus24_option3, 24, 23, 23, 23);
        Stage mus25 = new Stage(MUS, R.string.mus25_main_text, R.string.mus25_option1, R.string.mus25_option2, R.string.mus25_option3, 25, 19, 19, 19);
        Stage mus26 = new Stage(MUS, R.string.mus26_main_text, R.string.mus26_option1, R.string.mus26_option2, R.string.mus26_option3, 26, 33, 34, 36);
        Stage mus27 = new Stage(MUS, R.string.mus27_main_text, R.string.mus27_option1, R.string.mus27_option2, R.string.mus27_option3, 27, 29, 34, 36);
        Stage mus28 = new Stage(MUS, R.string.mus28_main_text, R.string.mus28_option1, R.string.mus28_option2, R.string.mus28_option3, 28, 29, 34, 36);
        Stage mus29 = new Stage(MUS, R.string.mus29_main_text, R.string.mus29_option1, R.string.mus29_option2, R.string.mus29_option3, 29, 35, 34, 35);
        Stage mus30 = new Stage(MUS, R.string.mus30_main_text, R.string.mus30_option1, R.string.mus30_option2, R.string.mus30_option3, 30, 34, 42, 43);
        Stage mus31 = new Stage(MUS, R.string.mus31_main_text, R.string.mus31_option1, R.string.mus31_option2, R.string.mus31_option3, 31, -1, -1, -1);
        Stage mus32 = new Stage(MUS, R.string.mus32_main_text, R.string.mus32_option1, R.string.mus32_option2, R.string.mus32_option3, 32, 37, 38, 38);
        Stage mus33 = new Stage(MUS, R.string.mus33_main_text, R.string.mus33_option1, R.string.mus33_option2, R.string.mus33_option3, 33, 39, 40, 41);
        Stage mus34 = new Stage(MUS, R.string.mus34_main_text, R.string.mus34_option1, R.string.mus34_option2, R.string.mus34_option3, 34, 46, 47, 36);
        Stage mus35 = new Stage(MUS, R.string.mus35_main_text, R.string.mus35_option1, R.string.mus35_option2, R.string.mus35_option3, 35, 44, 34, 45);
        Stage mus36 = new Stage(MUS, R.string.mus36_main_text, R.string.mus36_option1, R.string.mus36_option2, R.string.mus36_option3, 36, -1, -1, -1);
        Stage mus37 = new Stage(MUS, R.string.mus37_main_text, R.string.mus37_option1, R.string.mus37_option2, R.string.mus37_option3, 37, 51, 51, 51);
        Stage mus38 = new Stage(MUS, R.string.mus38_main_text, R.string.mus38_option1, R.string.mus38_option2, R.string.mus38_option3, 38, 51, 51, 51);
        Stage mus39 = new Stage(MUS, R.string.mus39_main_text, R.string.mus39_option1, R.string.mus39_option2, R.string.mus39_option3, 39, 52, 47, 53);
        Stage mus40 = new Stage(MUS, R.string.mus40_main_text, R.string.mus40_option1, R.string.mus40_option2, R.string.mus40_option3, 40, 54, 54, 39);
        Stage mus41 = new Stage(MUS, R.string.mus41_main_text, R.string.mus41_option1, R.string.mus41_option2, R.string.mus41_option3, 41, 55, 55, 56);
        Stage mus42 = new Stage(MUS, R.string.mus42_main_text, R.string.mus42_option1, R.string.mus42_option2, R.string.mus42_option3, 42, 57, 58, 59);
        Stage mus43 = new Stage(MUS, R.string.mus43_main_text, R.string.mus43_option1, R.string.mus43_option2, R.string.mus43_option3, 43, 60, 60, 60);
        Stage mus44 = new Stage(MUS, R.string.mus44_main_text, R.string.mus44_option1, R.string.mus44_option2, R.string.mus44_option3, 44, 61, 62, 34);
        Stage mus45 = new Stage(MUS, R.string.mus45_main_text, R.string.mus45_option1, R.string.mus45_option2, R.string.mus45_option3, 45, -1, -1, -1);
        Stage mus46 = new Stage(MUS, R.string.mus46_main_text, R.string.mus46_option1, R.string.mus46_option2, R.string.mus46_option3, 46, 63, 63, 63);
        Stage mus47 = new Stage(MUS, R.string.mus47_main_text, R.string.mus47_option1, R.string.mus47_option2, R.string.mus47_option3, 47, 46, 48, 36);
        Stage mus48 = new Stage(MUS, R.string.mus48_main_text, R.string.mus48_option1, R.string.mus48_option2, R.string.mus48_option3, 48, 46, 49, 36);
        Stage mus49 = new Stage(MUS, R.string.mus49_main_text, R.string.mus49_option1, R.string.mus49_option2, R.string.mus49_option3, 49, 46, 50, 36);
        Stage mus50 = new Stage(MUS, R.string.mus50_main_text, R.string.mus50_option1, R.string.mus50_option2, R.string.mus50_option3, 50, 64, 65, 65);
        Stage mus51 = new Stage(MUS, R.string.mus51_main_text, R.string.mus51_option1, R.string.mus51_option2, R.string.mus51_option3, 51, 66, 66, 67);
        Stage mus52 = new Stage(MUS, R.string.mus52_main_text, R.string.mus52_option1, R.string.mus52_option2, R.string.mus52_option3, 52, 68, 69, 36);
        Stage mus53 = new Stage(MUS, R.string.mus53_main_text, R.string.mus53_option1, R.string.mus53_option2, R.string.mus53_option3, 53, 52, 47, 53);
        Stage mus54 = new Stage(MUS, R.string.mus54_main_text, R.string.mus54_option1, R.string.mus54_option2, R.string.mus54_option3, 54, 70, 71, 70);
        Stage mus55 = new Stage(MUS, R.string.mus55_main_text, R.string.mus55_option1, R.string.mus55_option2, R.string.mus55_option3, 55, 72, 73, 74);
        Stage mus56 = new Stage(MUS, R.string.mus56_main_text, R.string.mus56_option1, R.string.mus56_option2, R.string.mus56_option3, 56, 55, 75, 55);
        Stage mus57 = new Stage(MUS, R.string.mus57_main_text, R.string.mus57_option1, R.string.mus57_option2, R.string.mus57_option3, 57, -1, -1, -1);
        Stage mus58 = new Stage(MUS, R.string.mus58_main_text, R.string.mus58_option1, R.string.mus58_option2, R.string.mus58_option3, 58, 77, 77, 77);
        Stage mus59 = new Stage(MUS, R.string.mus59_main_text, R.string.mus59_option1, R.string.mus59_option2, R.string.mus59_option3, 59, -1, -1, -1);
        Stage mus60 = new Stage(MUS, R.string.mus60_main_text, R.string.mus60_option1, R.string.mus60_option2, R.string.mus60_option3, 60, 76, 76, 76);
        Stage mus61 = new Stage(MUS, R.string.mus61_main_text, R.string.mus61_option1, R.string.mus61_option2, R.string.mus61_option3, 61, 78, 79, 34);
        Stage mus62 = new Stage(MUS, R.string.mus62_main_text, R.string.mus62_option1, R.string.mus62_option2, R.string.mus62_option3, 62, 61, 80, 34);
        Stage mus63 = new Stage(MUS, R.string.mus63_main_text, R.string.mus63_option1, R.string.mus63_option2, R.string.mus63_option3, 63, 46, 47, 36);
        Stage mus64 = new Stage(MUS, R.string.mus64_main_text, R.string.mus64_option1, R.string.mus64_option2, R.string.mus64_option3, 64, 68, 69, 36);
        Stage mus65 = new Stage(MUS, R.string.mus65_main_text, R.string.mus65_option1, R.string.mus65_option2, R.string.mus65_option3, 65, -1, -1, -1);
        Stage mus66 = new Stage(MUS, R.string.mus66_main_text, R.string.mus66_option1, R.string.mus66_option2, R.string.mus66_option3, 66, 81, 81, 81);
        Stage mus67 = new Stage(MUS, R.string.mus67_main_text, R.string.mus67_option1, R.string.mus67_option2, R.string.mus67_option3, 67, 81, 81, 81);
        Stage mus68 = new Stage(MUS, R.string.mus68_main_text, R.string.mus68_option1, R.string.mus68_option2, R.string.mus68_option3, 68, 93, 93, 93);
        Stage mus69 = new Stage(MUS, R.string.mus69_main_text, R.string.mus69_option1, R.string.mus69_option2, R.string.mus69_option3, 69, 68, 104, 68);
        Stage mus70 = new Stage(MUS, R.string.mus70_main_text, R.string.mus70_option1, R.string.mus70_option2, R.string.mus70_option3, 70, -1, -1, -1);
        Stage mus71 = new Stage(MUS, R.string.mus71_main_text, R.string.mus71_option1, R.string.mus71_option2, R.string.mus71_option3, 71, 91, 91, 91);
        Stage mus72 = new Stage(MUS, R.string.mus72_main_text, R.string.mus72_option1, R.string.mus72_option2, R.string.mus72_option3, 72, 82, 82, 82);
        Stage mus73 = new Stage(MUS, R.string.mus73_main_text, R.string.mus73_option1, R.string.mus73_option2, R.string.mus73_option3, 73, 82, 82, 82);
        Stage mus74 = new Stage(MUS, R.string.mus74_main_text, R.string.mus74_option1, R.string.mus74_option2, R.string.mus74_option3, 74, -1, -1, -1);
        Stage mus75 = new Stage(MUS, R.string.mus75_main_text, R.string.mus75_option1, R.string.mus75_option2, R.string.mus75_option3, 75, 34, 55, 83);
        Stage mus76 = new Stage(MUS, R.string.mus76_main_text, R.string.mus76_option1, R.string.mus76_option2, R.string.mus76_option3, 76, 84, 84, 84);
        Stage mus77 = new Stage(MUS, R.string.mus77_main_text, R.string.mus77_option1, R.string.mus77_option2, R.string.mus77_option3, 77, 85, 85, 85);
        Stage mus78 = new Stage(MUS, R.string.mus78_main_text, R.string.mus78_option1, R.string.mus78_option2, R.string.mus78_option3, 78, 92, 79, 34);
        Stage mus79 = new Stage(MUS, R.string.mus79_main_text, R.string.mus79_option1, R.string.mus79_option2, R.string.mus79_option3, 79, -1, -1, -1);
        Stage mus80 = new Stage(MUS, R.string.mus80_main_text, R.string.mus80_option1, R.string.mus80_option2, R.string.mus80_option3, 80, 86, 86, 86);
        Stage mus81 = new Stage(MUS, R.string.mus81_main_text, R.string.mus81_option1, R.string.mus81_option2, R.string.mus81_option3, 81, 87, 87, 87);
        Stage mus82 = new Stage(MUS, R.string.mus82_main_text, R.string.mus82_option1, R.string.mus82_option2, R.string.mus82_option3, 82, 71, 71, 71);
        Stage mus83 = new Stage(MUS, R.string.mus83_main_text, R.string.mus83_option1, R.string.mus83_option2, R.string.mus83_option3, 83, -1, -1, -1);
        Stage mus84 = new Stage(MUS, R.string.mus84_main_text, R.string.mus84_option1, R.string.mus84_option2, R.string.mus84_option3, 84, 105, 105, 105);
        Stage mus85 = new Stage(MUS, R.string.mus85_main_text, R.string.mus85_option1, R.string.mus85_option2, R.string.mus85_option3, 85, 89, 90, 89);
        Stage mus86 = new Stage(MUS, R.string.mus86_main_text, R.string.mus86_option1, R.string.mus86_option2, R.string.mus86_option3, 86, 106, 106, 106);
        Stage mus87 = new Stage(MUS, R.string.mus87_main_text, R.string.mus87_option1, R.string.mus87_option2, R.string.mus87_option3, 87, 88, 88, 88);
        Stage mus88 = new Stage(MUS, R.string.mus88_main_text, R.string.mus88_option1, R.string.mus88_option2, R.string.mus88_option3, 88, 111, 111, 111);
        Stage mus89 = new Stage(MUS, R.string.mus89_main_text, R.string.mus89_option1, R.string.mus89_option2, R.string.mus89_option3, 89, -1, -1, -1);
        Stage mus90 = new Stage(MUS, R.string.mus90_main_text, R.string.mus90_option1, R.string.mus90_option2, R.string.mus90_option3, 90, -1, -1, -1);
        Stage mus91 = new Stage(MUS, R.string.mus91_main_text, R.string.mus91_option1, R.string.mus91_option2, R.string.mus91_option3, 91, 125, 126, 127);
        Stage mus92 = new Stage(MUS, R.string.mus92_main_text, R.string.mus92_option1, R.string.mus92_option2, R.string.mus92_option3, 92, -1, -1, -1);
        Stage mus93 = new Stage(MUS, R.string.mus93_main_text, R.string.mus93_option1, R.string.mus93_option2, R.string.mus93_option3, 93, 94, 95, 96);
        Stage mus94 = new Stage(MUS, R.string.mus94_main_text, R.string.mus94_option1, R.string.mus94_option2, R.string.mus94_option3, 94, 97, 98, 98);
        Stage mus95 = new Stage(MUS, R.string.mus95_main_text, R.string.mus95_option1, R.string.mus95_option2, R.string.mus95_option3, 95, -1, -1, -1);
        Stage mus96 = new Stage(MUS, R.string.mus96_main_text, R.string.mus96_option1, R.string.mus96_option2, R.string.mus96_option3, 96, -1, -1, -1);
        Stage mus97 = new Stage(MUS, R.string.mus97_main_text, R.string.mus97_option1, R.string.mus97_option2, R.string.mus97_option3, 97, 100, 101, 101);
        Stage mus98 = new Stage(MUS, R.string.mus98_main_text, R.string.mus98_option1, R.string.mus98_option2, R.string.mus98_option3, 98, 94, 96, 99);
        Stage mus99 = new Stage(MUS, R.string.mus99_main_text, R.string.mus99_option1, R.string.mus99_option2, R.string.mus99_option3, 99, -1, -1, -1);
        Stage mus100 = new Stage(MUS, R.string.mus100_main_text, R.string.mus100_option1, R.string.mus100_option2, R.string.mus100_option3, 100, 102, 99, 103);
        Stage mus101 = new Stage(MUS, R.string.mus101_main_text, R.string.mus101_option1, R.string.mus101_option2, R.string.mus101_option3, 101, -1, -1, -1);
        Stage mus102 = new Stage(MUS, R.string.mus102_main_text, R.string.mus102_option1, R.string.mus102_option2, R.string.mus102_option3, 102, -1, -1, -1);
        Stage mus103 = new Stage(MUS, R.string.mus103_main_text, R.string.mus103_option1, R.string.mus103_option2, R.string.mus103_option3, 103, -1, -1, -1);
        Stage mus104 = new Stage(MUS, R.string.mus104_main_text, R.string.mus104_option1, R.string.mus104_option2, R.string.mus104_option3, 104, 88, 88, 88);
        Stage mus105 = new Stage(MUS, R.string.mus105_main_text, R.string.mus105_option1, R.string.mus105_option2, R.string.mus105_option3, 105, -1, -1, -1);
        Stage mus106 = new Stage(MUS, R.string.mus106_main_text, R.string.mus106_option1, R.string.mus106_option2, R.string.mus106_option3, 106, 107, 108, 109);
        Stage mus107 = new Stage(MUS, R.string.mus107_main_text, R.string.mus107_option1, R.string.mus107_option2, R.string.mus107_option3, 107, 115, 115, 115);
        Stage mus108 = new Stage(MUS, R.string.mus108_main_text, R.string.mus108_option1, R.string.mus108_option2, R.string.mus108_option3, 108, 115, 115, 115);
        Stage mus109 = new Stage(MUS, R.string.mus109_main_text, R.string.mus109_option1, R.string.mus109_option2, R.string.mus109_option3, 109, 110, 110, 110);
        Stage mus110 = new Stage(MUS, R.string.mus110_main_text, R.string.mus110_option1, R.string.mus110_option2, R.string.mus110_option3, 110, -1, -1, -1);
        Stage mus111 = new Stage(MUS, R.string.mus111_main_text, R.string.mus111_option1, R.string.mus111_option2, R.string.mus111_option3, 111, 112, 113, 112);
        Stage mus112 = new Stage(MUS, R.string.mus112_main_text, R.string.mus112_option1, R.string.mus112_option2, R.string.mus112_option3, 112, 114, 114, 115);
        Stage mus113 = new Stage(MUS, R.string.mus113_main_text, R.string.mus113_option1, R.string.mus113_option2, R.string.mus113_option3, 113, -1, -1, -1);
        Stage mus114 = new Stage(MUS, R.string.mus114_main_text, R.string.mus114_option1, R.string.mus114_option2, R.string.mus114_option3, 114, -1, -1, -1);
        Stage mus115 = new Stage(MUS, R.string.mus115_main_text, R.string.mus115_option1, R.string.mus115_option2, R.string.mus115_option3, 115, 116, 117, 118);
        Stage mus116 = new Stage(MUS, R.string.mus116_main_text, R.string.mus116_option1, R.string.mus116_option2, R.string.mus116_option3, 116, 119, 121, -1 );
        Stage mus117 = new Stage(MUS, R.string.mus117_main_text, R.string.mus117_option1, R.string.mus117_option2, R.string.mus117_option3, 117, 115, 115, 120);
        Stage mus118 = new Stage(MUS, R.string.mus118_main_text, R.string.mus118_option1, R.string.mus118_option2, R.string.mus118_option3, 118, 115, 115, 120);
        Stage mus119 = new Stage(MUS, R.string.mus119_main_text, R.string.mus119_option1, R.string.mus119_option2, R.string.mus119_option3, 119, 122, 119, 121);
        Stage mus120 = new Stage(MUS, R.string.mus120_main_text, R.string.mus120_option1, R.string.mus120_option2, R.string.mus120_option3, 120, -1, -1, -1);
        Stage mus121 = new Stage(MUS, R.string.mus121_main_text, R.string.mus121_option1, R.string.mus121_option2, R.string.mus121_option3, 121, 115, 115, 120);
        Stage mus122 = new Stage(MUS, R.string.mus122_main_text, R.string.mus122_option1, R.string.mus122_option2, R.string.mus122_option3, 122, 123, 117, 118);
        Stage mus123 = new Stage(MUS, R.string.mus123_main_text, R.string.mus123_option1, R.string.mus123_option2, R.string.mus123_option3, 123, 124, 121, 124);
        Stage mus124 = new Stage(MUS, R.string.mus124_main_text, R.string.mus124_option1, R.string.mus124_option2, R.string.mus124_option3, 124, -1, -1, -1);
        Stage mus125 = new Stage(MUS, R.string.mus125_main_text, R.string.mus125_option1, R.string.mus125_option2, R.string.mus125_option3, 125, -1, -1, -1);
        Stage mus126 = new Stage(MUS, R.string.mus126_main_text, R.string.mus126_option1, R.string.mus126_option2, R.string.mus126_option3, 126, 128, 129, 130);
        Stage mus127 = new Stage(MUS, R.string.mus127_main_text, R.string.mus127_option1, R.string.mus127_option2, R.string.mus127_option3, 127, -1, -1, -1);
        Stage mus128 = new Stage(MUS, R.string.mus128_main_text, R.string.mus128_option1, R.string.mus128_option2, R.string.mus128_option3, 128, 131, 132, 133);
        Stage mus129 = new Stage(MUS, R.string.mus129_main_text, R.string.mus129_option1, R.string.mus129_option2, R.string.mus129_option3, 129, 128, 132, 133);
        Stage mus130 = new Stage(MUS, R.string.mus130_main_text, R.string.mus130_option1, R.string.mus130_option2, R.string.mus130_option3, 130, 128, 132, 134);
        Stage mus131 = new Stage(MUS, R.string.mus131_main_text, R.string.mus131_option1, R.string.mus131_option2, R.string.mus131_option3, 131, 126, 127, 127);
        Stage mus132 = new Stage(MUS, R.string.mus132_main_text, R.string.mus132_option1, R.string.mus132_option2, R.string.mus132_option3, 132, 135, 136, 136);
        Stage mus133 = new Stage(MUS, R.string.mus133_main_text, R.string.mus133_option1, R.string.mus133_option2, R.string.mus133_option3, 133, 132, 127, 127);
        Stage mus134 = new Stage(MUS, R.string.mus134_main_text, R.string.mus134_option1, R.string.mus134_option2, R.string.mus134_option3, 134, 126, 127, 127);
        Stage mus135 = new Stage(MUS, R.string.mus135_main_text, R.string.mus135_option1, R.string.mus135_option2, R.string.mus135_option3, 135, -1, -1, -1);
        Stage mus136 = new Stage(MUS, R.string.mus136_main_text, R.string.mus136_option1, R.string.mus136_option2, R.string.mus136_option3, 136, -1, -1, -1);


        //^^^^^^^^^^^^^^^^^^ PUT STAGES HERE ^^^^^^^^^^^^^^^^^^

        for (Stage s : Stage.allStages) {
            int storyLine = s.getStoryLine();
            int id = s.getId();
            if(storyLine == INT) {
                intelligent.add(id, s);
            }
            else if(storyLine == ATH) {
                athletic.add(id, s);
            }
            else if(storyLine == MUS) {
                musical.add(id, s);
            }
        }
    }

    public static Story1 getStory() {
        if(story1 == null) {
            story1 = new Story1();
        }
        return story1;
    }



    public ArrayList<Stage> getIntelligent() {
        return intelligent;
    }

    public ArrayList<Stage> getAthletic() {
        return athletic;
    }

    public ArrayList<Stage> getMusical() {
        return musical;
    }

    public Stage getStage(int storyLine, int index) {
        Stage stage;
        Log.i("STORY CLASS", "Storyline: " + storyLine);
        Log.i("STORY CLASS", "Index: " + index);
        if(storyLine == -1 || index == -1) {
            stage = initial;
        }
        else if(storyLine == INT) {
            stage = intelligent.get(index);
        }
        else if (storyLine == ATH) {
            stage = athletic.get(index);
        }
        else if(storyLine == MUS) {
            stage = musical.get(index);
        }
        else {
            stage = initial;
        }
        return stage;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }
}
