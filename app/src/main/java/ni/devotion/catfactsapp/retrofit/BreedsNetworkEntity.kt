package ni.devotion.catfactsapp.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import ni.devotion.catfactsapp.model.Image

data class BreedsNetworkEntity(
        @SerializedName("adaptability")
        @Expose
        var adaptability: Int,

        @SerializedName("affection_level")
        @Expose
        var affection_level: Int,

        @SerializedName("alt_names")
        @Expose
        var alt_names: String,

        @SerializedName("cfa_url")
        @Expose
        var cfa_url: String,

        @SerializedName("child_friendly")
        @Expose
        var child_friendly: Int,

        @SerializedName("country_code")
        @Expose
        var country_code: String,

        @SerializedName("country_codes")
        @Expose
        var country_codes: String,

        @SerializedName("description")
        @Expose
        var description: String,

        @SerializedName("dog_friendly")
        @Expose
        var dog_friendly: Int,

        @SerializedName("energy_level")
        @Expose
        var energy_level: Int,

        @SerializedName("experimental")
        @Expose
        var experimental: Int,

        @SerializedName("grooming")
        @Expose
        var grooming: Int,

        @SerializedName("hairless")
        @Expose
        var hairless: Int,

        @SerializedName("health_issues")
        @Expose
        var health_issues: Int,

        @SerializedName("hypoallergenic")
        @Expose
        var hypoallergenic: Int,

        @SerializedName("id")
        @Expose
        var id: String,

        @SerializedName("image")
        @Expose
        var image: Image,

        @SerializedName("indoor")
        @Expose
        var indoor: Int,

        @SerializedName("intelligence")
        @Expose
        var intelligence: Int,

        @SerializedName("lap")
        @Expose
        var lap: Int,

        @SerializedName("life_span")
        @Expose
        var life_span: String,

        @SerializedName("name")
        @Expose
        var name: String,

        @SerializedName("natural")
        @Expose
        var natural: Int,

        @SerializedName("origin")
        @Expose
        var origin: String,

        @SerializedName("rare")
        @Expose
        var rare: Int,

        @SerializedName("reference_image_id")
        @Expose
        var reference_image_id: String,

        @SerializedName("rex")
        @Expose
        var rex: Int,

        @SerializedName("shedding_level")
        @Expose
        var shedding_level: Int,

        @SerializedName("short_legs")
        @Expose
        var short_legs: Int,

        @SerializedName("social_needs")
        @Expose
        var social_needs: Int,

        @SerializedName("stranger_friendly")
        @Expose
        var stranger_friendly: Int,

        @SerializedName("suppressed_tail")
        @Expose
        var suppressed_tail: Int,

        @SerializedName("temperament")
        @Expose
        var temperament: String,

        @SerializedName("vchospitas_url")
        @Expose
        var vchospitas_url: String,

        @SerializedName("vcstreet_url")
        @Expose
        var vcstreet_url: String,

        @SerializedName("vocalisation")
        @Expose
        var vocalisation: Int,

        @SerializedName("wikipedia_url")
        @Expose
        var wikipedia_url: String,


        )

