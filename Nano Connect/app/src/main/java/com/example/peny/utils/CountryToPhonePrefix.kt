package com.example.peny.utils

import android.util.Log
import java.util.*
import kotlin.collections.HashMap

public fun CountryToPhonePrefix (iso:String): String? {
    var map= HashMap<String,String>()
    map.put("AC", "+247")
    map.put("AD", "+376")
    map.put("AE", "+971")
    map.put("AF", "+93")
    map.put("AG", "+1-268")
    map.put("AI", "+1-264")
    map.put("AL", "+355")
    map.put("AM", "+374")
    map.put("AN", "+599")
    map.put("AO", "+244")
    map.put("AR", "+54")
    map.put("AS", "+1-684")
    map.put("AT", "+43")
    map.put("AU", "+61")
    map.put("AW", "+297")
    map.put("AX", "+358-18")
    map.put("AZ", "+374-97")
    map.put("AZ", "+994")
    map.put("BA", "+387")
    map.put("BB", "+1-246")
    map.put("BD", "+880")
    map.put("BE", "+32")
    map.put("BF", "+226")
    map.put("BG", "+359")
    map.put("BH", "+973")
    map.put("BI", "+257")
    map.put("BJ", "+229")
    map.put("BM", "+1-441")
    map.put("BN", "+673")
    map.put("BO", "+591")
    map.put("BR", "+55")
    map.put("BS", "+1-242")
    map.put("BT", "+975")
    map.put("BW", "+267")
    map.put("BY", "+375")
    map.put("BZ", "+501")
    map.put("CA", "+1")
    map.put("CC", "+61")
    map.put("CD", "+243")
    map.put("CF", "+236")
    map.put("CG", "+242")
    map.put("CH", "+41")
    map.put("CI", "+225")
    map.put("CK", "+682")
    map.put("CL", "+56")
    map.put("CM", "+237")
    map.put("CN", "+86")
    map.put("CO", "+57")
    map.put("CR", "+506")
    map.put("CS", "+381")
    map.put("CU", "+53")
    map.put("CV", "+238")
    map.put("CX", "+61")
    map.put("CY", "+90-392")
    map.put("CY", "+357")
    map.put("CZ", "+420")
    map.put("DE", "+49")
    map.put("DJ", "+253")
    map.put("DK", "+45")
    map.put("DM", "+1-767")
    map.put("DO", "+1-809") // and 1-829?
    map.put("DZ", "+213")
    map.put("EC", "+593")
    map.put("EE", "+372")
    map.put("EG", "+20")
    map.put("EH", "+212")
    map.put("ER", "+291")
    map.put("ES", "+34")
    map.put("ET", "+251")
    map.put("FI", "+358")
    map.put("FJ", "+679")
    map.put("FK", "+500")
    map.put("FM", "+691")
    map.put("FO", "+298")
    map.put("FR", "+33")
    map.put("GA", "+241")
    map.put("GB", "+44")
    map.put("GD", "+1-473")
    map.put("GE", "+995")
    map.put("GF", "+594")
    map.put("GG", "+44")
    map.put("GH", "+233")
    map.put("GI", "+350")
    map.put("GL", "+299")
    map.put("GM", "+220")
    map.put("GN", "+224")
    map.put("GP", "+590")
    map.put("GQ", "+240")
    map.put("GR", "+30")
    map.put("GT", "+502")
    map.put("GU", "+1-671")
    map.put("GW", "+245")
    map.put("GY", "+592")
    map.put("HK", "+852")
    map.put("HN", "+504")
    map.put("HR", "+385")
    map.put("HT", "+509")
    map.put("HU", "+36")
    map.put("ID", "+62")
    map.put("IE", "+353")
    map.put("IL", "+972")
    map.put("IM", "+44")
    map.put("IN", "+91")
    map.put("IO", "+246")
    map.put("IQ", "+964")
    map.put("IR", "+98")
    map.put("IS", "+354")
    map.put("IT", "+39")
    map.put("JE", "+44")
    map.put("JM", "+1-876")
    map.put("JO", "+962")
    map.put("JP", "+81")
    map.put("KE", "+254")
    map.put("KG", "+996")
    map.put("KH", "+855")
    map.put("KI", "+686")
    map.put("KM", "+269")
    map.put("KN", "+1-869")
    map.put("KP", "+850")
    map.put("KR", "+82")
    map.put("KW", "+965")
    map.put("KY", "+1-345")
    map.put("KZ", "+7")
    map.put("LA", "+856")
    map.put("LB", "+961")
    map.put("LC", "+1-758")
    map.put("LI", "+423")
    map.put("LK", "+94")
    map.put("LR", "+231")
    map.put("hr", "+385")
    map.put("LS", "+266")
    map.put("LT", "+370")
    map.put("LU", "+352")
    map.put("LV", "+371")
    map.put("LY", "+218")
    map.put("MA", "+212")
    map.put("MC", "+377")
    map.put("MD", "+373-533")
    map.put("MD", "+373")
    map.put("ME", "+382")
    map.put("MG", "+261")
    map.put("MH", "+692")
    map.put("MK", "+389")
    map.put("ML", "+223")
    map.put("MM", "+95")
    map.put("MN", "+976")
    map.put("MO", "+853")
    map.put("MP", "+1-670")
    map.put("MQ", "+596")
    map.put("MR", "+222")
    map.put("MS", "+1-664")
    map.put("MT", "+356")
    map.put("MU", "+230")
    map.put("MV", "+960")
    map.put("MW", "+265")
    map.put("MX", "+52")
    map.put("MY", "+60")
    map.put("MZ", "+258")
    map.put("NA", "+264")
    map.put("NC", "+687")
    map.put("NE", "+227")
    map.put("NF", "+672")
    map.put("NG", "+234")
    map.put("NI", "+505")
    map.put("NL", "+31")
    map.put("NO", "+47")
    map.put("NP", "+977")
    map.put("NR", "+674")
    map.put("NU", "+683")
    map.put("NZ", "+64")
    map.put("OM", "+968")
    map.put("PA", "+507")
    map.put("PE", "+51")
    map.put("PF", "+689")
    map.put("PG", "+675")
    map.put("PH", "+63")
    map.put("PK", "+92")
    map.put("PL", "+48")
    map.put("PM", "+508")
    map.put("PR", "+1-787") // and 1-939 ?
    map.put("PS", "+970")
    map.put("PT", "+351")
    map.put("PW", "+680")
    map.put("PY", "+595")
    map.put("QA", "+974")
    map.put("RE", "+262")
    map.put("RO", "+40")
    map.put("RS", "+381")
    map.put("RU", "+7")
    map.put("RW", "+250")
    map.put("SA", "+966")
    map.put("SB", "+677")
    map.put("SC", "+248")
    map.put("SD", "+249")
    map.put("SE", "+46")
    map.put("SG", "+65")
    map.put("SH", "+290")
    map.put("SI", "+386")
    map.put("SJ", "+47")
    map.put("SK", "+421")
    map.put("SL", "+232")
    map.put("SM", "+378")
    map.put("SN", "+221")
    map.put("SO", "+252")
    map.put("SO", "+252")
    map.put("SR", "+597")
    map.put("ST", "+239")
    map.put("SV", "+503")
    map.put("SY", "+963")
    map.put("SZ", "+268")
    map.put("TA", "+290")
    map.put("TC", "+1-649")
    map.put("TD", "+235")
    map.put("TG", "+228")
    map.put("TH", "+66")
    map.put("TJ", "+992")
    map.put("TK", "+690")
    map.put("TL", "+670")
    map.put("TM", "+993")
    map.put("TN", "+216")
    map.put("TO", "+676")
    map.put("TR", "+90")
    map.put("TT", "+1-868")
    map.put("TV", "+688")
    map.put("TW", "+886")
    map.put("TZ", "+255")
    map.put("UA", "+380")
    map.put("UG", "+256")
    map.put("US", "+1")
    map.put("UY", "+598")
    map.put("UZ", "+998")
    map.put("VA", "+379")
    map.put("VC", "+1-784")
    map.put("VE", "+58")
    map.put("VG", "+1-284")
    map.put("VI", "+1-340")
    map.put("VN", "+84")
    map.put("VU", "+678")
    map.put("WF", "+681")
    map.put("WS", "+685")
    map.put("YE", "+967")
    map.put("YT", "+262")
    map.put("ZA", "+27")
    map.put("ZM", "+260")
    map.put("ZW", "+263")
    map.put("ac", "+247")
    map.put("ad", "+376")
    map.put("ae", "+971")
    map.put("af", "+93")
    map.put("ag", "+1-268")
    map.put("ai", "+1-264")
    map.put("al", "+355")
    map.put("am", "+374")
    map.put("an", "+599")
    map.put("ao", "+244")
    map.put("ar", "+54")
    map.put("as", "+1-684")
    map.put("at", "+43")
    map.put("au", "+61")
    map.put("aw", "+297")
    map.put("ax", "+358-18")
    map.put("az", "+374-97")
    map.put("az", "+994")
    map.put("ba", "+387")
    map.put("bb", "+1-246")
    map.put("bd", "+880")
    map.put("be", "+32")
    map.put("bf", "+226")
    map.put("bg", "+359")
    map.put("bh", "+973")
    map.put("bi", "+257")
    map.put("bj", "+229")
    map.put("bm", "+1-441")
    map.put("bn", "+673")
    map.put("bo", "+591")
    map.put("br", "+55")
    map.put("bs", "+1-242")
    map.put("bt", "+975")
    map.put("bw", "+267")
    map.put("by", "+375")
    map.put("bz", "+501")
    map.put("ca", "+1")
    map.put("cc", "+61")
    map.put("cd", "+243")
    map.put("cf", "+236")
    map.put("cg", "+242")
    map.put("ch", "+41")
    map.put("ci", "+225")
    map.put("ck", "+682")
    map.put("cl", "+56")
    map.put("cm", "+237")
    map.put("cn", "+86")
    map.put("co", "+57")
    map.put("cr", "+506")
    map.put("cs", "+381")
    map.put("cu", "+53")
    map.put("cv", "+238")
    map.put("cx", "+61")
    map.put("cy", "+90-392")
    map.put("cy", "+357")
    map.put("cz", "+420")
    map.put("de", "+49")
    map.put("dj", "+253")
    map.put("dk", "+45")
    map.put("dm", "+1-767")
    map.put("do", "+1-809") // and 1-829?
    map.put("dz", "+213")
    map.put("ec", "+593")
    map.put("ee", "+372")
    map.put("eg", "+20")
    map.put("eh", "+212")
    map.put("er", "+291")
    map.put("es", "+34")
    map.put("et", "+251")
    map.put("fi", "+358")
    map.put("fj", "+679")
    map.put("fk", "+500")
    map.put("fm", "+691")
    map.put("fo", "+298")
    map.put("fr", "+33")
    map.put("ga", "+241")
    map.put("gb", "+44")
    map.put("gd", "+1-473")
    map.put("ge", "+995")
    map.put("gf", "+594")
    map.put("gg", "+44")
    map.put("gh", "+233")
    map.put("gi", "+350")
    map.put("gl", "+299")
    map.put("gm", "+220")
    map.put("gn", "+224")
    map.put("gp", "+590")
    map.put("gq", "+240")
    map.put("gr", "+30")
    map.put("gt", "+502")
    map.put("gu", "+1-671")
    map.put("gw", "+245")
    map.put("gy", "+592")
    map.put("hk", "+852")
    map.put("hn", "+504")
    map.put("hr", "+385")
    map.put("ht", "+509")
    map.put("hu", "+36")
    map.put("id", "+62")
    map.put("ie", "+353")
    map.put("il", "+972")
    map.put("im", "+44")
    map.put("in", "+91")
    map.put("io", "+246")
    map.put("iq", "+964")
    map.put("ir", "+98")
    map.put("is", "+354")
    map.put("it", "+39")
    map.put("je", "+44")
    map.put("jm", "+1-876")
    map.put("jo", "+962")
    map.put("jp", "+81")
    map.put("ke", "+254")
    map.put("kg", "+996")
    map.put("kh", "+855")
    map.put("ki", "+686")
    map.put("km", "+269")
    map.put("kn", "+1-869")
    map.put("kp", "+850")
    map.put("kr", "+82")
    map.put("kw", "+965")
    map.put("ky", "+1-345")
    map.put("kz", "+7")
    map.put("la", "+856")
    map.put("lb", "+961")
    map.put("lc", "+1-758")
    map.put("li", "+423")
    map.put("lk", "+94")
    map.put("lr", "+231")
    map.put("hr", "+385")
    map.put("ls", "+266")
    map.put("lt", "+370")
    map.put("lu", "+352")
    map.put("lv", "+371")
    map.put("ly", "+218")
    map.put("ma", "+212")
    map.put("mc", "+377")
    map.put("md", "+373-533")
    map.put("md", "+373")
    map.put("me", "+382")
    map.put("mg", "+261")
    map.put("mh", "+692")
    map.put("mk", "+389")
    map.put("ml", "+223")
    map.put("mm", "+95")
    map.put("mn", "+976")
    map.put("mo", "+853")
    map.put("mp", "+1-670")
    map.put("mq", "+596")
    map.put("mr", "+222")
    map.put("ms", "+1-664")
    map.put("mt", "+356")
    map.put("mu", "+230")
    map.put("mv", "+960")
    map.put("mw", "+265")
    map.put("mx", "+52")
    map.put("my", "+60")
    map.put("mz", "+258")
    map.put("na", "+264")
    map.put("nc", "+687")
    map.put("ne", "+227")
    map.put("nf", "+672")
    map.put("ng", "+234")
    map.put("ni", "+505")
    map.put("nl", "+31")
    map.put("no", "+47")
    map.put("np", "+977")
    map.put("nr", "+674")
    map.put("nu", "+683")
    map.put("nz", "+64")
    map.put("om", "+968")
    map.put("pa", "+507")
    map.put("pe", "+51")
    map.put("pf", "+689")
    map.put("pg", "+675")
    map.put("ph", "+63")
    map.put("pk", "+92")
    map.put("pl", "+48")
    map.put("pm", "+508")
    map.put("pr", "+1-787") // and 1-939 ?
    map.put("ps", "+970")
    map.put("pt", "+351")
    map.put("pw", "+680")
    map.put("py", "+595")
    map.put("qa", "+974")
    map.put("re", "+262")
    map.put("ro", "+40")
    map.put("rs", "+381")
    map.put("ru", "+7")
    map.put("rw", "+250")
    map.put("sa", "+966")
    map.put("sb", "+677")
    map.put("sc", "+248")
    map.put("sd", "+249")
    map.put("se", "+46")
    map.put("sg", "+65")
    map.put("sh", "+290")
    map.put("si", "+386")
    map.put("sj", "+47")
    map.put("sk", "+421")
    map.put("sl", "+232")
    map.put("sm", "+378")
    map.put("sn", "+221")
    map.put("so", "+252")
    map.put("so", "+252")
    map.put("sr", "+597")
    map.put("st", "+239")
    map.put("sv", "+503")
    map.put("sy", "+963")
    map.put("sz", "+268")
    map.put("ta", "+290")
    map.put("tc", "+1-649")
    map.put("td", "+235")
    map.put("tg", "+228")
    map.put("th", "+66")
    map.put("tj", "+992")
    map.put("tk", "+690")
    map.put("tl", "+670")
    map.put("tm", "+993")
    map.put("tn", "+216")
    map.put("to", "+676")
    map.put("tr", "+90")
    map.put("tt", "+1-868")
    map.put("tv", "+688")
    map.put("tw", "+886")
    map.put("tz", "+255")
    map.put("ua", "+380")
    map.put("ug", "+256")
    map.put("us", "+1")
    map.put("uy", "+598")
    map.put("uz", "+998")
    map.put("va", "+379")
    map.put("vc", "+1-784")
    map.put("ve", "+58")
    map.put("vg", "+1-284")
    map.put("vi", "+1-340")
    map.put("vn", "+84")
    map.put("vu", "+678")
    map.put("wf", "+681")
    map.put("ws", "+685")
    map.put("ye", "+967")
    map.put("yt", "+262")
    map.put("za", "+27")
    map.put("zm", "+260")
    map.put("zw", "+263")

    val result= map.get(iso)

    Log.d("tag","print $map, a rezultat je $result")

    if (result!=null)
        return result
    else return "+"

    }
