package ni.devotion.catfactsapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ni.devotion.catfactsapp.model.Image

@Entity(tableName =  "Breeds")
class BreedsCacheEntity(
    @ColumnInfo(name = "url")
    var adaptability: Int,

    @ColumnInfo(name = "affection_level")
    var affection_level: Int,

    @ColumnInfo(name = "alt_names")
    var alt_names: String,


    @ColumnInfo(name = "cfa_url")
    var cfa_url: String,


    @ColumnInfo(name = "child_friendly")
    var child_friendly: Int,


    @ColumnInfo(name = "country_code")
    var country_code: String,


    @ColumnInfo(name = "country_codes")
    var country_codes: String,


    @ColumnInfo(name = "description")
    var description: String,


    @ColumnInfo(name = "dog_friendly")
    var dog_friendly: Int,


    @ColumnInfo(name = "energy_level")
    var energy_level: Int,


    @ColumnInfo(name = "experimental")
    var experimental: Int,


    @ColumnInfo(name = "grooming")
    var grooming: Int,


    @ColumnInfo(name = "hairless")
    var hairless: Int,


    @ColumnInfo(name = "health_issues")
    var health_issues: Int,


    @ColumnInfo(name = "hypoallergenic")
    var hypoallergenic: Int,

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: String,

    var image: Image,


    @ColumnInfo(name = "indoor")
    var indoor: Int,


    @ColumnInfo(name = "intelligence")
    var intelligence: Int,


    @ColumnInfo(name = "lap")
    var lap: Int,


    @ColumnInfo(name = "life_span")
    var life_span: String,


    @ColumnInfo(name = "name")
    var name: String,


    @ColumnInfo(name = "natural")
    var natural: Int,


    @ColumnInfo(name = "origin")
    var origin: String,


    @ColumnInfo(name = "rare")
    var rare: Int,


    @ColumnInfo(name = "reference_image_id")
    var reference_image_id: String,


    @ColumnInfo(name = "rex")
    var rex: Int,


    @ColumnInfo(name = "shedding_level")
    var shedding_level: Int,


    @ColumnInfo(name = "short_legs")
    var short_legs: Int,


    @ColumnInfo(name = "social_needs")
    var social_needs: Int,


    @ColumnInfo(name = "stranger_friendly")
    var stranger_friendly: Int,


    @ColumnInfo(name = "suppressed_tail")
    var suppressed_tail: Int,


    @ColumnInfo(name = "temperament")
    var temperament: String,


    @ColumnInfo(name = "vchospitas_url")
    var vchospitas_url: String,


    @ColumnInfo(name = "vcstreet_url")
    var vcstreet_url: String,


    @ColumnInfo(name = "vocalisation")
    var vocalisation: Int,


    @ColumnInfo(name = "wikipedia_url")
    var wikipedia_url: String,

    )

