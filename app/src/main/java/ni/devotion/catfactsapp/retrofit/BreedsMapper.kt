package ni.devotion.catfactsapp.retrofit

import ni.devotion.catfactsapp.model.Breeds
import ni.devotion.catfactsapp.model.Cat
import ni.devotion.catfactsapp.utils.EntityMapper
import javax.inject.Inject

class BreedsMapper
@Inject constructor(): EntityMapper <BreedsNetworkEntity, Breeds>{
    override fun mapFromEntity(entity: BreedsNetworkEntity): Breeds {
        return Breeds(
            adaptability = entity.adaptability,
            affection_level = entity.affection_level,
            alt_names = entity.alt_names,
            name = entity.name,
            id = entity.id,
            cfa_url = entity.cfa_url,
            child_friendly = entity.child_friendly,
            country_code = entity.country_code,
            country_codes = entity.country_codes,
            description = entity.description,
            dog_friendly = entity.dog_friendly,
            energy_level = entity.energy_level,
            experimental = entity.experimental,
            grooming = entity.grooming,
            hairless = entity.hairless,
            health_issues = entity.health_issues,
            hypoallergenic = entity.hypoallergenic,
            image = entity.image,
            indoor = entity.indoor,
            intelligence = entity.intelligence,
            lap = entity.lap,
            life_span = entity.life_span,
            natural = entity.natural,
            origin = entity.origin,
            rare = entity.rare,
            reference_image_id = entity.reference_image_id,
            rex = entity.rex,
            shedding_level = entity.shedding_level,
            short_legs = entity.short_legs,
            social_needs = entity.social_needs,
            stranger_friendly = entity.stranger_friendly,
            suppressed_tail = entity.suppressed_tail,
            temperament = entity.temperament,
            vchospitas_url = entity.vchospitas_url,
            vcstreet_url = entity.vcstreet_url,
            vocalisation = entity.vocalisation,
            wikipedia_url = entity.wikipedia_url
        )
    }

    override fun mapToEntity(domainModel: Breeds): BreedsNetworkEntity {
        return BreedsNetworkEntity(
            adaptability = domainModel.adaptability,
            affection_level = domainModel.affection_level,
            alt_names = domainModel.alt_names,
            name = domainModel.name,
            id = domainModel.id,
            cfa_url = domainModel.cfa_url,
            child_friendly = domainModel.child_friendly,
            country_code = domainModel.country_code,
            country_codes = domainModel.country_codes,
            description = domainModel.description,
            dog_friendly = domainModel.dog_friendly,
            energy_level = domainModel.energy_level,
            experimental = domainModel.experimental,
            grooming = domainModel.grooming,
            hairless = domainModel.hairless,
            health_issues = domainModel.health_issues,
            hypoallergenic = domainModel.hypoallergenic,
            image = domainModel.image,
            indoor = domainModel.indoor,
            intelligence = domainModel.intelligence,
            lap = domainModel.lap,
            life_span = domainModel.life_span,
            natural = domainModel.natural,
            origin = domainModel.origin,
            rare = domainModel.rare,
            reference_image_id = domainModel.reference_image_id,
            rex = domainModel.rex,
            shedding_level = domainModel.shedding_level,
            short_legs = domainModel.short_legs,
            social_needs = domainModel.social_needs,
            stranger_friendly = domainModel.stranger_friendly,
            suppressed_tail = domainModel.suppressed_tail,
            temperament = domainModel.temperament,
            vchospitas_url = domainModel.vchospitas_url,
            vcstreet_url = domainModel.vcstreet_url,
            vocalisation = domainModel.vocalisation,
            wikipedia_url = domainModel.wikipedia_url
        )
    }

    fun mapFromEntityList(entities: List<BreedsNetworkEntity>): List<Breeds>{
        return entities.map { mapFromEntity(it) }
    }
}