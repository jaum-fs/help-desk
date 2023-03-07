package com.project.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.helpdesk.domain.Chamado;
import com.project.helpdesk.domain.Cliente;
import com.project.helpdesk.domain.Tecnico;
import com.project.helpdesk.domain.enums.Perfil;
import com.project.helpdesk.domain.enums.Prioridade;
import com.project.helpdesk.domain.enums.Status;
import com.project.helpdesk.repositories.ChamadoRepository;
import com.project.helpdesk.repositories.ClienteRepository;
import com.project.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void dbInstance() {
		
		
		Tecnico t1 = new Tecnico(null, "Valdir Cezar", "34396824203", "vadir@mail.com", "123" );
		t1.addPerfil(Perfil.ADMIN);
		
		Tecnico t2 = new Tecnico(null, "Pedro Ferreira", "62257821092", "pedro@mail.com", "456" );
		t2.addPerfil(Perfil.ADMIN);
		
		Cliente c1 = new Cliente(null, "Linus Tovalds", "14831044270", "torvalds@mail.com", "123");
		
		Chamado call = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", t1, c1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(t1,t2));
		clienteRepository.saveAll(Arrays.asList(c1));
		chamadoRepository.saveAll(Arrays.asList(call));
		
	}
	
}
