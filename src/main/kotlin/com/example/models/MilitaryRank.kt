package com.example.models

import kotlinx.serialization.SerialInfo
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class MilitaryRank{
    @Serializable
    @SerialName("FuhrerPresident")
    data class FuhrerPresident(
        val rankName: String = "Führer-President",
        val img: String = "/images/ranks/fuhrerPresident.jpg"
    ) : MilitaryRank()

    @Serializable
    @SerialName("MajorGeneral")
    data class MajorGeneral(
        val rankName: String = "Major General",
        val img: String = "/images/ranks/majorGeneral.jpg"
    ) : MilitaryRank()

    @Serializable
    @SerialName("Colonel")
    data class Colonel(
        val rankName: String = "Colonel",
        val img: String = "/images/ranks/colonel.jpg"
    ) : MilitaryRank()

    @Serializable
    @SerialName("LieutenantColonel")
    data class LieutenantColonel(
        val rankName: String = "Lieutenant Colonel",
        val img: String = "/images/ranks/lieutenantColonel.jpg"
    ) : MilitaryRank()

    @Serializable
    @SerialName("Major")
    data class Major(
        val rankName: String = "Major",
        val img: String = "/images/ranks/major.jpg"
    ) : MilitaryRank()

    @Serializable
    @SerialName("FirstLieutenant")
    data class FirstLieutenant(
        val rankName: String = "First Lieutenant",
        val img: String = "/images/ranks/firstLieutenant.jpg"
    ) : MilitaryRank()

    @Serializable
    @SerialName("Civilian")
    data class Civilian (
        val rankName: String = "Civilian",
        val img: String = ""
    ): MilitaryRank()
}

//@Serializable
//enum class MilitaryRank(
//    @SerialName("rankName") val rankName: String,
//    @SerialName("img") val img: String
//) {
//
//FuhrerPresident("Führer-President", "/images/ranks/fuhrerPresident.jpg"),
//MajorGeneral("Major General", "/images/ranks/majorGeneral.jpg"),
//Colonel("Colonel", "/images/ranks/colonel.jpg"),
//LieutenantColonel("Lieutenant Colonel", "/images/ranks/lieutenantColonel.jpg") ,
//Major("Major", "/images/ranks/major.jpg") ,
//FirstLieutenant("First Lieutenant", "/images/ranks/firstLieutenant.jpg"),
//Civilian("Civilian", "")
//}
