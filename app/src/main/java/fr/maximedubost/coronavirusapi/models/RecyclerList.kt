package fr.maximedubost.coronavirusapi.models
import android.util.ArraySet
import com.google.gson.annotations.SerializedName

data class RecyclerList(
        @SerializedName("data")
        val `data`: Data,
        @SerializedName("status")
        val status: Int,
        @SerializedName("type")
        val type: String
)

data class Data(
        @SerializedName("change")
        val change: Change,
        @SerializedName("generated_on")
        val generatedOn: Int,
        @SerializedName("regions")
        val regions: Regions,
        @SerializedName("summary")
        val summary: Summary
)

data class Change(
        @SerializedName("active_cases")
        val activeCases: Int,
        @SerializedName("critical")
        val critical: Int,
        @SerializedName("death_ratio")
        val deathRatio: Double,
        @SerializedName("deaths")
        val deaths: Int,
        @SerializedName("recovered")
        val recovered: Int,
        @SerializedName("recovery_ratio")
        val recoveryRatio: Double,
        @SerializedName("tested")
        val tested: Int,
        @SerializedName("total_cases")
        val totalCases: Int
)

data class Regions(
        @SerializedName("afghanistan")
        val afghanistan: Region,
        @SerializedName("albania")
        val albania: Region,
        @SerializedName("algeria")
        val algeria: Region,
        @SerializedName("andorra")
        val andorra: Region,
        @SerializedName("angola")
        val angola: Region,
        @SerializedName("anguilla")
        val anguilla: Region,
        @SerializedName("antigua_and_barbuda")
        val antiguaAndBarbuda: Region,
        @SerializedName("argentina")
        val argentina: Region,
        @SerializedName("armenia")
        val armenia: Region,
        @SerializedName("aruba")
        val aruba: Region,
        @SerializedName("australia")
        val australia: Region,
        @SerializedName("austria")
        val austria: Region,
        @SerializedName("azerbaijan")
        val azerbaijan: Region,
        @SerializedName("bahamas")
        val bahamas: Region,
        @SerializedName("bahrain")
        val bahrain: Region,
        @SerializedName("bangladesh")
        val bangladesh: Region,
        @SerializedName("barbados")
        val barbados: Region,
        @SerializedName("belarus")
        val belarus: Region,
        @SerializedName("belgium")
        val belgium: Region,
        @SerializedName("belize")
        val belize: Region,
        @SerializedName("benin")
        val benin: Region,
        @SerializedName("bermuda")
        val bermuda: Region,
        @SerializedName("bhutan")
        val bhutan: Region,
        @SerializedName("bolivia")
        val bolivia: Region,
        @SerializedName("bosnia_and_herzegovina")
        val bosniaAndHerzegovina: Region,
        @SerializedName("botswana")
        val botswana: Region,
        @SerializedName("brazil")
        val brazil: Region,
        @SerializedName("british_virgin_islands")
        val britishVirginIslands: Region,
        @SerializedName("brunei")
        val brunei: Region,
        @SerializedName("bulgaria")
        val bulgaria: Region,
        @SerializedName("burkina_faso")
        val burkinaFaso: Region,
        @SerializedName("burundi")
        val burundi: Region,
        @SerializedName("cabo_verde")
        val caboVerde: Region,
        @SerializedName("cambodia")
        val cambodia: Region,
        @SerializedName("cameroon")
        val cameroon: Region,
        @SerializedName("canada")
        val canada: Region,
        @SerializedName("caribbean_netherlands")
        val caribbeanNetherlands: Region,
        @SerializedName("cayman_islands")
        val caymanIslands: Region,
        @SerializedName("central_african_republic")
        val centralAfricanRepublic: Region,
        @SerializedName("chad")
        val chad: Region,
        @SerializedName("channel_islands")
        val channelIslands: Region,
        @SerializedName("chile")
        val chile: Region,
        @SerializedName("colombia")
        val colombia: Region,
        @SerializedName("comoros")
        val comoros: Region,
        @SerializedName("congo")
        val congo: Region,
        @SerializedName("costa_rica")
        val costaRica: Region,
        @SerializedName("croatia")
        val croatia: Region,
        @SerializedName("cuba")
        val cuba: Region,
        @SerializedName("curacao")
        val curacao: Region,
        @SerializedName("cyprus")
        val cyprus: Region,
        @SerializedName("czechia")
        val czechia: Region,
        @SerializedName("denmark")
        val denmark: Region,
        @SerializedName("diamond_princess")
        val diamondPrincess: Region,
        @SerializedName("djibouti")
        val djibouti: Region,
        @SerializedName("dominica")
        val dominica: Region,
        @SerializedName("dominican_republic")
        val dominicanRepublic: Region,
        @SerializedName("ecuador")
        val ecuador: Region,
        @SerializedName("egypt")
        val egypt: Region,
        @SerializedName("el_salvador")
        val elSalvador: Region,
        @SerializedName("equatorial_guinea")
        val equatorialGuinea: Region,
        @SerializedName("eritrea")
        val eritrea: Region,
        @SerializedName("estonia")
        val estonia: Region,
        @SerializedName("eswatini")
        val eswatini: Region,
        @SerializedName("ethiopia")
        val ethiopia: Region,
        @SerializedName("faeroe_islands")
        val faeroeIslands: Region,
        @SerializedName("falkland_islands")
        val falklandIslands: Region,
        @SerializedName("fiji")
        val fiji: Region,
        @SerializedName("finland")
        val finland: Region,
        @SerializedName("france")
        val france: Region,
        @SerializedName("french_guiana")
        val frenchGuiana: Region,
        @SerializedName("french_polynesia")
        val frenchPolynesia: Region,
        @SerializedName("gabon")
        val gabon: Region,
        @SerializedName("gambia")
        val gambia: Region,
        @SerializedName("germany")
        val germany: Region,
        @SerializedName("ghana")
        val ghana: Region,
        @SerializedName("gibraltar")
        val gibraltar: Region,
        @SerializedName("greece")
        val greece: Region,
        @SerializedName("greenland")
        val greenland: Region,
        @SerializedName("grenada")
        val grenada: Region,
        @SerializedName("guadeloupe")
        val guadeloupe: Region,
        @SerializedName("guatemala")
        val guatemala: Region,
        @SerializedName("guinea")
        val guinea: Region,
        @SerializedName("guinea_bissau")
        val guineaBissau: Region,
        @SerializedName("guyana")
        val guyana: Region,
        @SerializedName("haiti")
        val haiti: Region,
        @SerializedName("honduras")
        val honduras: Region,
        @SerializedName("hong_kong")
        val hongKong: Region,
        @SerializedName("hungary")
        val hungary: Region,
        @SerializedName("iceland")
        val iceland: Region,
        @SerializedName("india")
        val india: Region,
        @SerializedName("indonesia")
        val indonesia: Region,
        @SerializedName("iran")
        val iran: Region,
        @SerializedName("iraq")
        val iraq: Region,
        @SerializedName("ireland")
        val ireland: Region,
        @SerializedName("isle_of_man")
        val isleOfMan: Region,
        @SerializedName("israel")
        val israel: Region,
        @SerializedName("italy")
        val italy: Region,
        @SerializedName("ivory_coast")
        val ivoryCoast: Region,
        @SerializedName("jamaica")
        val jamaica: Region,
        @SerializedName("japan")
        val japan: Region,
        @SerializedName("jordan")
        val jordan: Region,
        @SerializedName("kazakhstan")
        val kazakhstan: Region,
        @SerializedName("kenya")
        val kenya: Region,
        @SerializedName("kuwait")
        val kuwait: Region,
        @SerializedName("kyrgyzstan")
        val kyrgyzstan: Region,
        @SerializedName("laos")
        val laos: Region,
        @SerializedName("latvia")
        val latvia: Region,
        @SerializedName("lesotho")
        val lesotho: Region,
        @SerializedName("liberia")
        val liberia: Region,
        @SerializedName("libya")
        val libya: Region,
        @SerializedName("liechtenstein")
        val liechtenstein: Region,
        @SerializedName("lithuania")
        val lithuania: Region,
        @SerializedName("luxembourg")
        val luxembourg: Region,
        @SerializedName("macao")
        val macao: Region,
        @SerializedName("madagascar")
        val madagascar: Region,
        @SerializedName("malawi")
        val malawi: Region,
        @SerializedName("malaysia")
        val malaysia: Region,
        @SerializedName("maldives")
        val maldives: Region,
        @SerializedName("mali")
        val mali: Region,
        @SerializedName("malta")
        val malta: Region,
        @SerializedName("marshall_islands")
        val marshallIslands: Region,
        @SerializedName("martinique")
        val martinique: Region,
        @SerializedName("mauritania")
        val mauritania: Region,
        @SerializedName("mauritius")
        val mauritius: Region,
        @SerializedName("mayotte")
        val mayotte: Region,
        @SerializedName("mexico")
        val mexico: Region,
        @SerializedName("moldova")
        val moldova: Region,
        @SerializedName("monaco")
        val monaco: Region,
        @SerializedName("mongolia")
        val mongolia: Region,
        @SerializedName("montenegro")
        val montenegro: Region,
        @SerializedName("montserrat")
        val montserrat: Region,
        @SerializedName("morocco")
        val morocco: Region,
        @SerializedName("mozambique")
        val mozambique: Region,
        @SerializedName("ms_zaandam")
        val msZaandam: Region,
        @SerializedName("myanmar")
        val myanmar: Region,
        @SerializedName("namibia")
        val namibia: Region,
        @SerializedName("nepal")
        val nepal: Region,
        @SerializedName("netherlands")
        val netherlands: Region,
        @SerializedName("new_caledonia")
        val newCaledonia: Region,
        @SerializedName("new_zealand")
        val newZealand: Region,
        @SerializedName("nicaragua")
        val nicaragua: Region,
        @SerializedName("niger")
        val niger: Region,
        @SerializedName("nigeria")
        val nigeria: Region,
        @SerializedName("north_macedonia")
        val northMacedonia: Region,
        @SerializedName("norway")
        val norway: Region,
        @SerializedName("oman")
        val oman: Region,
        @SerializedName("pakistan")
        val pakistan: Region,
        @SerializedName("palestine")
        val palestine: Region,
        @SerializedName("panama")
        val panama: Region,
        @SerializedName("papua_new_guinea")
        val papuaNewGuinea: Region,
        @SerializedName("paraguay")
        val paraguay: Region,
        @SerializedName("peru")
        val peru: Region,
        @SerializedName("philippines")
        val philippines: Region,
        @SerializedName("poland")
        val poland: Region,
        @SerializedName("portugal")
        val portugal: Region,
        @SerializedName("qatar")
        val qatar: Region,
        @SerializedName("reunion")
        val reunion: Region,
        @SerializedName("romania")
        val romania: Region,
        @SerializedName("russia")
        val russia: Region,
        @SerializedName("rwanda")
        val rwanda: Region,
        @SerializedName("saint_kitts_and_nevis")
        val saintKittsAndNevis: Region,
        @SerializedName("saint_lucia")
        val saintLucia: Region,
        @SerializedName("saint_martin")
        val saintMartin: Region,
        @SerializedName("saint_pierre_miquelon")
        val saintPierreMiquelon: Region,
        @SerializedName("samoa")
        val samoa: Region,
        @SerializedName("san_marino")
        val sanMarino: Region,
        @SerializedName("sao_tome_and_principe")
        val saoTomeAndPrincipe: Region,
        @SerializedName("saudi_arabia")
        val saudiArabia: Region,
        @SerializedName("senegal")
        val senegal: Region,
        @SerializedName("serbia")
        val serbia: Region,
        @SerializedName("seychelles")
        val seychelles: Region,
        @SerializedName("sierra_leone")
        val sierraLeone: Region,
        @SerializedName("singapore")
        val singapore: Region,
        @SerializedName("sint_maarten")
        val sintMaarten: Region,
        @SerializedName("slovakia")
        val slovakia: Region,
        @SerializedName("slovenia")
        val slovenia: Region,
        @SerializedName("solomon_islands")
        val solomonIslands: Region,
        @SerializedName("somalia")
        val somalia: Region,
        @SerializedName("south_africa")
        val southAfrica: Region,
        @SerializedName("south_korea")
        val southKorea: Region,
        @SerializedName("south_sudan")
        val southSudan: Region,
        @SerializedName("spain")
        val spain: Region,
        @SerializedName("sri_lanka")
        val sriLanka: Region,
        @SerializedName("st_barth")
        val stBarth: Region,
        @SerializedName("st_vincent_grenadines")
        val stVincentGrenadines: Region,
        @SerializedName("sudan")
        val sudan: Region,
        @SerializedName("suriname")
        val suriname: Region,
        @SerializedName("sweden")
        val sweden: Region,
        @SerializedName("switzerland")
        val switzerland: Region,
        @SerializedName("syria")
        val syria: Region,
        @SerializedName("taiwan")
        val taiwan: Region,
        @SerializedName("tajikistan")
        val tajikistan: Region,
        @SerializedName("tanzania")
        val tanzania: Region,
        @SerializedName("thailand")
        val thailand: Region,
        @SerializedName("timor_leste")
        val timorLeste: Region,
        @SerializedName("togo")
        val togo: Region,
        @SerializedName("trinidad_and_tobago")
        val trinidadAndTobago: Region,
        @SerializedName("tunisia")
        val tunisia: Region,
        @SerializedName("turkey")
        val turkey: Region,
        @SerializedName("turks_and_caicos")
        val turksAndCaicos: Region,
        @SerializedName("uganda")
        val uganda: Region,
        @SerializedName("uk")
        val uk: Region,
        @SerializedName("ukraine")
        val ukraine: Region,
        @SerializedName("united_arab_emirates")
        val unitedArabEmirates: Region,
        @SerializedName("uruguay")
        val uruguay: Region,
        @SerializedName("usa")
        val usa: Region,
        @SerializedName("uzbekistan")
        val uzbekistan: Region,
        @SerializedName("vanuatu")
        val vanuatu: Region,
        @SerializedName("vatican_city")
        val vaticanCity: Region,
        @SerializedName("venezuela")
        val venezuela: Region,
        @SerializedName("vietnam")
        val vietnam: Region,
        @SerializedName("wallis_and_futuna")
        val wallisAndFutuna: Region,
        @SerializedName("western_sahara")
        val westernSahara: Region,
        @SerializedName("yemen")
        val yemen: Region,
        @SerializedName("zambia")
        val zambia: Region,
        @SerializedName("zimbabwe")
        val zimbabwe: Region
) {
        fun toArrayList(): ArrayList<Region> = arrayListOf(
            this.afghanistan,
            this.albania,
            this.algeria,
            this.andorra,
            this.angola,
            this.anguilla,
            this.antiguaAndBarbuda,
            this.argentina,
            this.armenia,
            this.aruba,
            this.australia,
            this.austria,
            this.azerbaijan,
            this.bahamas,
            this.bahrain,
            this.bangladesh,
            this.barbados,
            this.belarus,
            this.belgium,
            this.belize,
            this.benin,
            this.bermuda,
            this.bhutan,
            this.bolivia,
            this.bosniaAndHerzegovina,
            this.botswana,
            this.brazil,
            this.britishVirginIslands,
            this.brunei,
            this.bulgaria,
            this.burkinaFaso,
            this.burundi,
            this.caboVerde,
            this.cambodia,
            this.cameroon,
            this.canada,
            this.caribbeanNetherlands,
            this.caymanIslands,
            this.centralAfricanRepublic,
            this.chad,
            this.channelIslands,
            this.chile,
            this.colombia,
            this.comoros,
            this.congo,
            this.costaRica,
            this.croatia,
            this.cuba,
            this.curacao,
            this.cyprus,
            this.czechia,
            this.denmark,
            this.diamondPrincess,
            this.djibouti,
            this.dominica,
            this.dominicanRepublic,
            this.ecuador,
            this.egypt,
            this.elSalvador,
            this.equatorialGuinea,
            this.eritrea,
            this.estonia,
            this.eswatini,
            this.ethiopia,
            this.faeroeIslands,
            this.falklandIslands,
            this.fiji,
            this.finland,
            this.france,
            this.frenchGuiana,
            this.frenchPolynesia,
            this.gabon,
            this.gambia,
            this.germany,
            this.ghana,
            this.gibraltar,
            this.greece,
            this.greenland,
            this.grenada,
            this.guadeloupe,
            this.guatemala,
            this.guinea,
            this.guineaBissau,
            this.guyana,
            this.haiti,
            this.honduras,
            this.hongKong,
            this.hungary,
            this.iceland,
            this.india,
            this.indonesia,
            this.iran,
            this.iraq,
            this.ireland,
            this.isleOfMan,
            this.israel,
            this.italy,
            this.ivoryCoast,
            this.jamaica,
            this.japan,
            this.jordan,
            this.kazakhstan,
            this.kenya,
            this.kuwait,
            this.kyrgyzstan,
            this.laos,
            this.latvia,
            this.lesotho,
            this.liberia,
            this.libya,
            this.liechtenstein,
            this.lithuania,
            this.luxembourg,
            this.macao,
            this.madagascar,
            this.malawi,
            this.malaysia,
            this.maldives,
            this.mali,
            this.malta,
            this.marshallIslands,
            this.martinique,
            this.mauritania,
            this.mauritius,
            this.mayotte,
            this.mexico,
            this.moldova,
            this.monaco,
            this.mongolia,
            this.montenegro,
            this.montserrat,
            this.morocco,
            this.mozambique,
            this.msZaandam,
            this.myanmar,
            this.namibia,
            this.nepal,
            this.netherlands,
            this.newCaledonia,
            this.newZealand,
            this.nicaragua,
            this.niger,
            this.nigeria,
            this.northMacedonia,
            this.norway,
            this.oman,
            this.pakistan,
            this.palestine,
            this.panama,
            this.papuaNewGuinea,
            this.paraguay,
            this.peru,
            this.philippines,
            this.poland,
            this.portugal,
            this.qatar,
            this.reunion,
            this.romania,
            this.russia,
            this.rwanda,
            this.saintKittsAndNevis,
            this.saintLucia,
            this.saintMartin,
            this.saintPierreMiquelon,
            this.samoa,
            this.sanMarino,
            this.saoTomeAndPrincipe,
            this.saudiArabia,
            this.senegal,
            this.serbia,
            this.seychelles,
            this.sierraLeone,
            this.singapore,
            this.sintMaarten,
            this.slovakia,
            this.slovenia,
            this.solomonIslands,
            this.somalia,
            this.southAfrica,
            this.southKorea,
            this.southSudan,
            this.spain,
            this.sriLanka,
            this.stBarth,
            this.stVincentGrenadines,
            this.sudan,
            this.suriname,
            this.sweden,
            this.switzerland,
            this.syria,
            this.taiwan,
            this.tajikistan,
            this.tanzania,
            this.thailand,
            this.timorLeste,
            this.togo,
            this.trinidadAndTobago,
            this.tunisia,
            this.turkey,
            this.turksAndCaicos,
            this.uganda,
            this.uk,
            this.ukraine,
            this.unitedArabEmirates,
            this.uruguay,
            this.usa,
            this.uzbekistan,
            this.vanuatu,
            this.vaticanCity,
            this.venezuela,
            this.vietnam,
            this.wallisAndFutuna,
            this.westernSahara,
            this.yemen,
            this.zambia,
            this.zimbabwe
    )
}

data class Region(
        @SerializedName("active_cases")
        val activeCases: Int,
        @SerializedName("change")
        val change: Change,
        @SerializedName("critical")
        val critical: Int,
        @SerializedName("death_ratio")
        val deathRatio: Double,
        @SerializedName("deaths")
        val deaths: Int,
        @SerializedName("iso3166a2")
        val iso3166a2: String,
        @SerializedName("iso3166a3")
        val iso3166a3: String,
        @SerializedName("iso3166numeric")
        val iso3166numeric: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("recovered")
        val recovered: Int,
        @SerializedName("recovery_ratio")
        val recoveryRatio: Double,
        @SerializedName("tested")
        val tested: Int,
        @SerializedName("total_cases")
        val totalCases: Int
)

data class Summary(
        @SerializedName("active_cases")
        val activeCases: Int,
        @SerializedName("critical")
        val critical: Int,
        @SerializedName("death_ratio")
        val deathRatio: Double,
        @SerializedName("deaths")
        val deaths: Int,
        @SerializedName("recovered")
        val recovered: Int,
        @SerializedName("recovery_ratio")
        val recoveryRatio: Double,
        @SerializedName("tested")
        val tested: Int,
        @SerializedName("total_cases")
        val totalCases: Int
)