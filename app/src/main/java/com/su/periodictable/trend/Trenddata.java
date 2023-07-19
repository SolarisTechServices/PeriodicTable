package com.su.periodictable.trend;

public class Trenddata {
    public static int trendx;
    public static int trendy = 0;
    public static int trendz = 0;


    public static String[][] trendelementprd = {
            {"H","He"},
            {"Li","Be","B","C","N","O","F","Ne"},
            {"Na","Mg","Al","Si","P","S","Cl","Ar",},
            {"K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge", "As","Se","Br","Kr"},
            {"Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn", "Sb","Te","I","Xe"},
            {"Cs","Ba","_","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn"},
            {"Fr","Ra","_","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Nh", "Fl","Mc","Lv","Ts","Og"},
            {"La","Ce","Pr","Nd","Pm","Sm"," Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu"},
            {"Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr"}
    };

        public static  String[][] trendelementgrp= {
                {"H","Li","Na","K","Rb","Cs","Fr"},
                {"Be","Mg","Ca","Sr","Ba","Ra"},
                {"Sc","Y","La","Ac"},
                {"Ti","Zr","Hf","Rf","Ce","Th"},
                {"V","Nb","Ta","Db","Pr","Pa"},
                {"Cr","Mo","W","Sg","Nd","U"},
                {"Mn","Tc","Re","Bh","Pm","Np"},
                {"Fe","Ru","Os","Hs","Sm","Pu"},
                {"Co","Rh","Ir","Mt","Eu","Am"},
                {"Ni","Pd","Pt","Ds","Gd","Cm"},
                {"Cu","Ag","Au","Rg","Tb","Bk"},
                {"Zn","Cd","Hg","Cn","Dy","Cf"},
                {"B", "Al", "Ga", "In", "Tl","Nh","Ho","Es"},
                {"C", "Si", "Ge", "Sn", "Pb", "Fl", "Er", "Fm"},
                {"N", "P", "As", "Sb", "Bi", "Mc", "Tm", "Md"},
                {"O", "S", "Se", "Te", "Po", "Lv", "Yb", " No"},
                {"F", "Cl", "Br", "I", "At", "Ts", "Lu", "Lr"},
                {"He", "Ne", "Ar", "Kr", "Xe", "Rn", "Og"}
            };

    public static int[][] graphSizeprd = {
            {53, 31},
            {167, 112, 87, 67, 56, 48, 42, 38},
            {190,145,118,111,98,88,79,71},
            {243,194,184,176,171,166,161,156,152,149,145,142,136,125,114,103,94,88},
            {265,219,212,206,198,190,183,178,173,169,165,161,156,145,133,123,115,108},
            {298,253,0,208,200,193,188,185,180,177,174,171,156,154,143,135,127,120},
            {0,247,206,205,238,231,233,225,228,226,226,222,222,217,}
    };
    public static int[][] graphSizegrp = {
            {53,167,190,243,265,298},
            {112,145,194,219,253},
            {184,212,0,0},
            {176,206,208,0},
            {171,198,200,0},
            {166,190,193,0},
            {161,183,188,0},
            {156,178,185,0},
            {152,173,180,0},
            {149,169,177,0},
            {145,165,174,0},
            {142,161,171,0},
            {87,118,136,156,156},
            {67,111,125,145,154},
            {56,98,114,133,143},
            {48,88,103,123,135},
            {42,79,94,115,127},
            {38,71,88,108,120}

    };

    public static double[][] graphiegrp = {
            {1312,520.2,495.8,403.0,375.7,380},
            {899.5,737.7,589.8,549.5,502.9,509.3},
            {633.1,600,538.1,534.4,527,533.1,540,544.5,547.1,593.4,565.8,573.0,581.0,589.3,596.7,603.4,523.5,499,587,568,597.6,604.5,584.7,578,581,601,608,619,627,635,642,470},
            {658.8,640.1,658.5,580},
            {650.9,652.1,761,665},
            {652.9,684.3,770,757},
            {717.3,702,760,740},
            {762.5,710.2,840,730},
            {760.4,719.7,880,800},
            {737.1,804.4,870,960},
            {745.5,731.0,890.1,1020},
            {906.4,867.8,1007.1,1155},
            {800.6,577.5,578.8,558.3,589.4,707.2},
            {1086.5,786.5,762,708.6,715.6,832.2},
            {1402.3,1011.8,947,834,703,538.3},
            {1313.9,999.6,941.0,869.3,812.1,663.9},
            {1681.0,1251.2,1139.9,1008.4,899.003,736.9},
            {2372.3,2080.7,1520.6,1350.8,1170.4,1037,860.1}

    };

    static double[][] graphieprd = {
            {1312, 2372.3},
            {520.2, 899.5, 800.6, 1086.5, 1402.3, 1313.9, 1681, 2080.7},
            {495.8, 737.7, 577.5, 786.5, 1011.8, 999.6, 1251.2, 1520.6},
            {418.8, 589.8, 633.1, 658.8, 650.9, 652.9, 717.3, 762.5, 760.4, 737.1, 745.5, 906.4, 578.8, 762, 947, 941, 1139.9, 1350.8},
            {403, 549.5, 600, 640.1, 652.1, 684.3, 702, 710.2, 719.7, 804.4, 731, 867.8, 558.3, 708.6, 834, 869.3, 1008.4, 1170.4},
            {375.7, 502.9, 538.1, 534.4, 527, 533.1, 540, 544.5, 547.1, 593.4, 565.8, 573, 581, 589.3, 596.7, 603.4, 523.5, 658.5, 761, 770, 760, 840, 880, 870, 890.1, 1007.1, 589.4, 715.6, 703, 812.1, 899.003, 1037},
            {380, 509.3, 499, 587, 568, 597.6, 604.5, 584.7, 578, 581, 601, 608, 619, 627, 635, 642, 470, 580, 665, 757, 740, 730, 800, 960, 1020, 1155, 707.2, 832.2, 538.3, 663.9, 736.9, 860.1}
    };

    public static double[][] graphmpprd = {
            {-259.2,0,},
            {180.5,1287,2077,3500,-210.0,-218.8,-219.7,-248.6},
            {97.79,650.0,660.3,1414,44.15,115.2,101.5,189.3},
            {63.38,842.0,1541,1670,1910,1907,1246,1538,1495,1455,1085,419.5,29.77,938.2,816.8,220.8,7.050,157.4},
            {39.30,768.8,1522,1854,2477,2622,2157,2333,1963,1555,961.8,321.1,156.6,231.9,630.6,449.5,113.7,111.8},
            {28.44,725.0,920.0,2233,3017,3414,3453,3033,2446,1768,1064,38.83,303.8,327.5,271.4,253.8,301.8,71.15},
            {27.00,699.8,1050},
    };

    public static double[][] graphmpgrp = {
            {259.2,180.5,97.79,63.38,39.30,28.44,27.00},
            {1287,650.0,842.0,768.8,725.0,699.8},
            {1541,1522,920.0,1050},
            {1670,1854,2233},
            {1910,2477,3017},
            {1907,2622,3414},
            {1246,2157,3453},
            {1538,2333,3033},
            {1495,1963,2446},
            {1455,1555,1768},
            {1085,961.8,1064},
            {419.5,321.1,38.83},
            {2077,660.3,29.77,156.6,303.8},
            {3500,1414,938.2,231.9,327.5},
            {210.0,44.15,816.8,630.6,271.4},
            {218.8,115.2,220.8,449.5,253.8},
            {219.7,101.5,7.050,113.7,301.8},
            {0,248.6,189.3,157.4,111.8,71.15},
    };

    public static double[][] graphbpprd = {
            {252.9,268.9},
            {1342,2468,4000,4827,195.8,183.0,188.1,246.0},
            {882.9,1090,2519,3265,280.5,444.6,34.04,185.8},
            {758.8,1484,2836,3287,3407,2671,2061,2861,2927,2913,2560,907.0,2229,2833,613.0,684.8,58.78,153.4},
            {687.8,1377,3345,4406,4741,4639,4262,4147,3695,2963,2162,766.8,2027,2586,1587,987.8,184.4,108.1},
            {670.8,1845,3464,4600,5455,5555,5900,5008,4428,3825,2836,356.6,1473,1749,1564,962.0,336.8,61.85},
            {676.8,1140,3200},
    };
    public static double[][] graphbpgrp = {
            {252.9,1342,882.9,758.8,687.8,670.8,676.8},
            {2468,1090,1484,1377,1845,1140},
            {2836,3345,3464,3200},
            {3287,4406,4600},
            {3407,4741,5455},
            {2671,4639,5555},
            {2061,4262,5900},
            {2861,4147,5008},
            {2927,3695,4428},
            {2913,2963,3825},
            {2560,2162,2836},
            {907.0,766.8,356.6},
            {4000,2519,2229,2027,1473},
            {4827,3265,2833,2586,1749},
            {195.8,280.5,613.0,1587,1564},
            {183.0,444.6,684.8,987.8,962.0},
            {188.1,34.04,58.78,184.4,336.8},
            {268.9,246.0,185.8,153.4,108.1,61.85},

    };

    public static String[][] colorhalides = {
            {"Agl","Yellow"},
            {"Pbl2","Yellow"},
            {"Bil3","Yellow"},
            {"HOBr(Layer test)","Yellow"},
            {"AgBr","Yellow"},
            {"Cu2l2","Yellow"},
            {"AgCl","White"},
            {"Hg2Cl2","White"},
            {"HgCl2","White"},
            {"CuCl2","White"},
            {"PbCl2","White"},
            {"PbBr2","White"},
            {"ZnCl2.H2O (Butter of zinc, killed salt)","White"},
            {"KCl(Silvine)","White"},
            {"NH4Cl(Salammonic)","White"},
            {"SnCl4.5H2O(Oxymuriate,butter of tin)","White"},
            {"|NiCl2","Green"},
            {"CrCl3","Green"},
            {"FeCl2","Green"},
            {"CuCl2","Blue","Green"},
            {"CoCl2(An hydrous)","Blue"},
            {"CoCl2(dil.solution,symphathetic ink)","Pink"},
            {"FeCl3","Black","Red"},
            {"Bil3","Black"},
            {"FeCl3.6H2O","Red","Brown"},
            {"Hgl2","Red"},
            {"FeCl3.6H2O(Solution)","Yellow"},
            {"Kl3","Brown"},
            {"K[Bil4](Solution)","Orange"},

    };

    public static String[][] colorsulphides = {
            {"HgS(vermillion)","Black"},
            {"PbS","Black"},
            {"CuS","Black"},
            {"Bi2S3","Black"},
            {"Cu2S","Black"},
            {"CoS","Black"},
            {"Ag2S","Black"},
            {"FeS","Black"},
            {"NiS","Black"},
            {"Na2S","Black"},
            {"CdS","Yellow"},
            {"SnS2(Artificial gold)","Yellow"},
            {"FeS2(fools gold)","Yellow"},
            {"As2S3","Yellow"},
            {"As2S5","Yellow"},
            {"Sb2S3","Orange"},
            {"Sb2S5","Orange"},
            {"ZnS","White"},
            {"SnS","Brown"},


    };
    public static String[][] coloroxides = {
            {"Hg2O","Balck"},
            {"Ag2O","Black"},
            {"MnO2(Pyrolusite)","Black"},
            {"Cuo","Black"},
            {"Ni2O3","Black"},
            {"Na2O","Black"},
            {"PbO2","Black","Brown"},
            {"PbO(Massicot)","Yellow"},
            {"Na2O2","Yellow","White"},
            {"ZnO(Philosphers wool)","White"},
            {"CaO(Quick lime)","White"},
            {"PbO(litharge)","Red"},
            {"Pb3O4(minimum,red lead)","Red"},
            {"Li2O","Red"},
            {"Cu2o","Red"},
            {"Fe2O3(indian red)","Red"},
            {"HgO","Orange","Red"},
            {"KO2(Super oxide)","Orange"},
            {"CdO","Brown"},
            {"CoO.MgO(Cobalt pink)","Pink"},
            {"CoO.SnO(Cobalt green)","Green"},
            {"CoO.ZnO(Rinmanns green)","Green"},
            {"Cr2o3","Green"},
            {"CoO.Al2O3(Thenard blue)","Blue"},
            {"Cr(O2)2O(butterfly structure)","Blue"},
    };
    public static String [][] colorferrocynide = {
            {"K4[Fe(CN)6]","Yellow"},
            {"Cu2[Fe(CN)6]","Brown"},
            {"Zn2[Fe(CN)6]","White"},
            {"Fe4[Fe(CN)6]3(Prussian blue)","Blue"},
            {"K3[Fe(CN)6]","Blue"},
            {"Fe2[Fe(CN)6]3(Turnbulls blue)","Blue"},
            {"Cd2[Fe(CN)6]","Blue"},

    };
    public static String [][] colorchromates ={
            {"PbCrO4(Yellow chrome)","Yellow"},
            {"BaCrO4","Yellow"},
            {"Na2CrO4(Solution)","Yellow"},
            {"AgCrO4","Red"},
            {"Hg2Cro4","Red"},
            {"PbCrO4.PbP(Red chrome)","Red"},
            {"K2Cr2O7(Prismatic structure)","Orange"},

    };
    public static String [][] colorsulphatesandsulphites ={
            {"CuSO4.5H2O(Blue vitriol)","Blue"},
            {"Ag2SO4","White"},
            {"Hg2SO4","White"},
            {"SrSO4","White"},
            {"BaSO4","White"},
            {"PbSO4","White"},
            {"Ag2SO4","White"},
            {"Hg2SO3","White"},
            {"SrSO3","White"},
            {"BaSO3","White"},
            {"PbSO3","White"},
            {"CaSO4.2H2O(Gypsum)","White"},
            {"ZnSO4.7H2O(white vitriol)","White"},
            {"CaSO4.1/2H2O(Plaster of paris)","White"},
            {"FeSO4.7H2O(Green vitriol)","Green"},

    };
    public static String [][] colorhydroxides = {
            {"Fe(OH)3","Red","Brown"},
            {"Cu(OH)2","Blue"},
            {"Al(OH)3","White"},
            {"Zn(OH)2","White"},
            {"Pb(OH)2","White"},
            {"Pb(OH)2.2PbCO3(White leasd)","White"},
            {"Cr(OH)3","Green"},


    };
    public static String [][] colorcynides = {
            {"Hg.Hg(CN)2","Black"},
            {"Pb(CN)2","White"},
            {"AgCN","White"},
            {"Cd(CN)2","White"},
            {"Zn(CN)2","White"},
            {"Cu(CN)2","Yellow"},
            {"Fe(CN)2","Yellow","Brown"},
            {"Co(CN)2","Brown"},
            {"Ni(CN)2","Green"}

    };
    public static String [][] colorchromium = {
            {"Cr(OH)3","Green"},
            {"Cr2(SO4)3","Green"},
            {"CrCl3","Green"},
            {"Cr2O3","Green"},
            {"[Cr(H2O)5Cl]Cl2.H2O","Green"},
            {"[Cr(H2O)4Cl2]Cl.2h2O","Green"},
            {"[Cr(H2O)6]Cl3","Violet"},

    };
    public static String [][] colorNickel = {
            {"NiCl2","Green"},
            {"Ni(OH)2","Green"},
            {"(DMG)2Ni","Red"},

    };
    public static String [][] colorSilver = {
            {"Ag2CO3","Yellow"},
            {"Ag3PO4","Yellow"},
            {"Ag2AsO3","Yellow"},
            {"AgBr","Yellow"},
            {"Agl","Yellow"},
            {"Ag2SO4","White"},
            {"AgCl","White"},
            {"Ag2S2O3","White"},
            {"Ag3AsO4","Red"},
            {"Ag2CrO4","Red"},
            {"Ag2S","Black"},
            {"Ag2O","Black"},

    };
    public static String [][] colormiscellaneous = {
            {"K[Co(NO2)6](indian yellow,Fisher salt)","Yellow"},
            {"Cs3[Co(NO2)6]","Yellow"},
            {"Rb3[Co(NO2)6]","Yellow"},
            {"(Nh4)3[Co(NO2)6]","Yellow"},
            {"(NH4)3PO4.12MoO3","Yellow"},
            {"(NH4)3AsO4.12MoO3","Yellow"},
            {"KMnO4","Pink"},
            {"NaMnO4","Pink"},
            {"HMnO4","Pink"},
            {"Mn(OH)2","Pink"},
            {"CoCl2.2H2O","Pink"},
            {"(NH4)2SnCl(Mordant,Pink salt)","Pink"},
            {"Co(CN)2","Brown"},
            {"MnS","Brown"},
            {"FeSO4.NO(Brown ring)","Brown"},
            {"FeSO4.NO(Brown ring)","Brown"},
            {"FeSO4.NO(Brown ring)","Brown"},
            {"[Fe(H2O)5NO]SO4(Brown complex)","Brown"},
            {"[Fe(H2O)5NO]SO4(Brown complex)","Brown"},
            {"Fe(SCN)3(ppt.)","Red"},
            {"Fe(CH3COO)3","Red"},
            {"CrO2Cl2(Fumes)","Red"},
            {"Cu2C2(Explosive)","Red"},
            {"[Cu(NH3)4]SO4(Switzers reagent)","Blue"},
            {"CuHAso3(scheels green)","Green"},
            {"Na2MnO4","Green"},
            {"Na4[fe(CN)5NOS]","Purple"},
            {"BiOl","Orange"},
    };
       public static int compvar = 0;
}
