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
        return heroRepository.save(hero);
    }

    public Optional<Hero> updateHero(Long id, HeroDTO heroDTO) {
        return heroRepository.findById(id).map(hero -> {
            hero.setName(heroDTO.getName());
            hero.setSlug(heroDTO.getSlug());
            hero.setImages(heroDTO.getImages());
            hero.setPowerstats(heroDTO.getPowerstats());
            return heroRepository.save(hero);
        });
    }

    public boolean deleteHero(Long id) {
        return heroRepository.findById(id).map(hero -> {
            heroRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
