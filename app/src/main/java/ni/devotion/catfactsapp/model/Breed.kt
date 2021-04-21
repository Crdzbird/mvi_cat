package ni.devotion.catfactsapp.model

typealias Breeds = ArrayList<Breed>

data class Breed (
        val altNames: String,
        val experimental: Long,
        val hairless: Long,
        val hypoallergenic: Long,
        val id: String,
        val lifeSpan: String,
        val name: String,
        val natural: Long,
        val origin: String,
        val rare: Long,
        val referenceImageID: Any? = null,
        val rex: Long,
        val shortLegs: Long,
        val suppressedTail: Long,
        val temperament: String,
        val weightImperial: String,
        val wikipediaURL: String
)
