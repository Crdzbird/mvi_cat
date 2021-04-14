package ni.devotion.catfactsapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Weight (

        @SerializedName("imperial")
        @Expose
        var imperial: String,

        @SerializedName("metric")
        @Expose
        var metric: String,



)
