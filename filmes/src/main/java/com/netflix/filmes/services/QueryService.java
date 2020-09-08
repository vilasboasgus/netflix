package com.netflix.filmes.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.filmes.model.Filme;
import com.netflix.filmes.model.FilmeEntity;
import com.netflix.filmes.repository.FilmesRepository;

@Service
public class QueryService implements IQueryService  {

	@Autowired
    FilmesRepository filmesRepository;

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<Filme> JPQLQuery(String genero)
    {
        EntityManager em = emf.createEntityManager();
        //em.getTransaction().begin( );

        Query query = em.createQuery("Select f.id,f.titulo,g.descricao from tb_filmes f " 
        		+ "inner join tb_generos g on f.idGenerod=g.id where g.descricao = :genero");
        query.setParameter("genero", genero);
        @SuppressWarnings("unchecked")
        List<Filme> list =(List<Filme>)query.getResultList();
        em.close();

        return list;

    }

    public List<FilmeEntity> getFilmes()
    {
        return filmesRepository.findAll();
    }
    

    public List<FilmeEntity> getDetalhesFilme(Integer id){
    	return filmesRepository.findAllById(id);
    }
    

    		
}
