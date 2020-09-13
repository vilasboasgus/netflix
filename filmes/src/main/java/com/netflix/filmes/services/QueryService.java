package com.netflix.filmes.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.filmes.model.Filme;
import com.netflix.filmes.model.PopularesDTO;
import com.netflix.filmes.repository.FilmesRepository;

@Service
public class QueryService implements IQueryService  {

	@Autowired
    FilmesRepository filmesRepository;

    @Autowired
    EntityManagerFactory emf;
    

    @SuppressWarnings("unchecked")
	@Override
    public List<PopularesDTO> getFilmesMaisVistosByCategoria()
    {
    	List<PopularesDTO> populares = new ArrayList<>();
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT f FROM MaisVistosEntity mv inner join Filme f on mv.idFilme = f.idFilme");
        List<Filme> resultList = query.getResultList();
        for (Filme filme: resultList) {
        	populares.add(new PopularesDTO(filme.getCategoria().getDescricao(),filme.getTitulo(),null));
		}
        em.close();
        return populares;

    }

    

    		
}
