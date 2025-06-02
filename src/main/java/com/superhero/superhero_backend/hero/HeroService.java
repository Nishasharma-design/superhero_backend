package com.superhero.superhero_backend.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    @Autowired
    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public List<Hero> getAllHeros() {
        return heroRepository.findAll();
    }

    public Hero createHero(HeroDTO heroDTO) {
        Hero hero = new Hero();
        hero.setName(heroDTO.getName());
        hero.setSlug(heroDTO.getSlug());
        hero.setImages(heroDTO.getImages());
        hero.setPowerstats(heroDTO.getPowerstats());
        hero.setAppearance(heroDTO.getAppearance());
        hero.setBiography(heroDTO.getBiography());
        hero.setWork(heroDTO.getWork());
        hero.setConnections(heroDTO.getConnections());
        return heroRepository.save(hero);
    }

    public Optional<Hero> updateHero(Long id, HeroDTO heroDTO) {
        return heroRepository.findById(id).map(hero -> {
            hero.setName(heroDTO.getName());
            hero.setSlug(heroDTO.getSlug());
            hero.setImages(heroDTO.getImages());
            hero.setPowerstats(heroDTO.getPowerstats());
            hero.setAppearance(heroDTO.getAppearance());
            hero.setBiography(heroDTO.getBiography());
            hero.setWork(heroDTO.getWork());
            hero.setConnections(heroDTO.getConnections());
            return heroRepository.save(hero);
        });
    }

    public boolean deleteHero(Long id) {
        return heroRepository.findById(id).map(hero -> {
            heroRepository.deleteById(id);
            return true;
        }).orElse(false);
    }


    public Optional<Hero> getHeroById(Long id) {
        return heroRepository.findById(id);
    }

    public Optional<Powerstats> getPowerstatsById(Long id) {
        return heroRepository.findById(id).map(Hero::getPowerstats);
    }

    public Optional<Appearance> getAppearanceById(Long id) {
        return heroRepository.findById(id).map(Hero::getAppearance);
    }

    public Optional<Work> getWorkById(Long id) {
        return heroRepository.findById(id).map(Hero::getWork);
    }

    public Optional<Biography> getBiographyById(Long id) {
        return heroRepository.findById(id).map(Hero::getBiography);
    }

    public Optional<Connections> getConnectionsById(Long id) {
        return heroRepository.findById(id).map(Hero::getConnections);
    }

   

}

