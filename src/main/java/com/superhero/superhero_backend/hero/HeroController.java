package com.superhero.superhero_backend.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/heroes")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public List<Hero> getAllHeros() {
        return heroService.getAllHeros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getHeroById(@PathVariable Long id) {
        return heroService.getHeroById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Hero> createHero(@RequestBody HeroDTO heroDTO) {
        Hero created = heroService.createHero(heroDTO);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hero> updateHero(@PathVariable Long id, @RequestBody HeroDTO heroDTO) {
        return heroService.updateHero(id, heroDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHero(@PathVariable Long id) {
        boolean deleted = heroService.deleteHero(id);
        return deleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }


    @GetMapping("/powerstats/{id}.json")
    public ResponseEntity<?> getPowerstats(@PathVariable Long id) {
        return heroService.getPowerstatsById(id)
                 .map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
                }

    @GetMapping("/appearance/{id}.json")
    public ResponseEntity<?> getAppearance(@PathVariable Long id) {
        return heroService.getAppearanceById(id)
                  .map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }


    @GetMapping("/biography/{id}.json")
    public ResponseEntity<?> getBiography(@PathVariable Long id) {
        return heroService.getBiographyById(id)
                 .map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
    }


    @GetMapping("/work/{id}.json")
    public ResponseEntity<?> getWork(@PathVariable Long id) {
        return heroService.getWorkById(id)
                 .map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/connections/{id}.json")
    public ResponseEntity<?> getConnections(@PathVariable Long id) {
        return heroService.getConnectionsById(id)
                 .map(ResponseEntity::ok)
                 .orElse(ResponseEntity.notFound().build());
    }




}
