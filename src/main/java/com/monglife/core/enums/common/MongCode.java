package com.monglife.core.enums.common;

public enum MongCode {

    CH000("CH000", 0, "화산알"),
    CH001("CH001", 0, "석탄알"),
    CH002("CH002", 0, "황금알"),
    CH003("CH003", 0, "목성알"),
    CH004("CH004", 0, "지구알"),
    CH005("CH005", 0, "바람알"),
    CH100("CH100", 1, "별몽"),
    CH101("CH101", 1, "동글몽"),
    CH102("CH102", 1, "네몽"),
    CH200("CH200", 2, "안씻은 별별몽"),
    CH210("CH210", 2, "무난한 별별몽"),
    CH220("CH220", 2, "유쾌한 별별몽"),
    CH230("CH230", 2, "완벽한 별별몽"),
    CH201("CH201", 2, "안씻은 둥글몽"),
    CH211("CH211", 2, "무난한 둥글몽"),
    CH221("CH221", 2, "유쾌한 둥글몽"),
    CH231("CH231", 2, "완벽한 둥글몽"),
    CH202("CH202", 2, "안씻은 나네몽"),
    CH212("CH212", 2, "무난한 나네몽"),
    CH222("CH222", 2, "유쾌한 나네몽"),
    CH232("CH232", 2, "완벽한 나네몽"),
    CH203("CH203", 2, "까몽"),
    CH300("CH300", 3, "병든 별뿔몽"),
    CH310("CH310", 3, "평범한 별뿔몽"),
    CH320("CH320", 3, "매력적인 별뿔몽"),
    CH330("CH330", 3, "엘리트 별뿔몽"),
    CH301("CH301", 3, "병든 땡글몽"),
    CH311("CH311", 3, "평범한 땡글몽"),
    CH321("CH321", 3, "매력적인 땡글몽"),
    CH331("CH331", 3, "엘리트 땡글몽"),
    CH302("CH302", 3, "병든 마미무메몽"),
    CH312("CH312", 3, "평범한 마미무메몽"),
    CH322("CH322", 3, "매력적인 마미무메몽"),
    CH332("CH332", 3, "엘리트 마미무메몽"),
    CH303("CH303", 3, "쌔까몽")
    ;

    public final String code;
    public final Integer level;
    public final String name;

    MongCode(String code, Integer level, String name) {
        this.code = code;
        this.level = level;
        this.name = name;
    }
}
