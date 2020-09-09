package com.netflix.filmes.services;

import java.util.List;

import com.netflix.filmes.model.PopularesDTO;

public interface IQueryService {


	List<PopularesDTO> getFilmesMaisVistosByCategoria();


}
