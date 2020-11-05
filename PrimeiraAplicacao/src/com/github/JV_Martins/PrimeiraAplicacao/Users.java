package com.github.JV_Martins.PrimeiraAplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Users {
	
	String nome;
	String email;

	public Users(String nome, String email) {

		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void alteraDados(String nome, String email) {

		this.email = email;
		this.nome = nome;
	}

	public void escritor(String path ) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
		buffWrite.append("\nNome  => " + this.nome);
		buffWrite.newLine();
		buffWrite.append("Email => " + this.email);
		buffWrite.close();
	}

	public void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				
			} else
				break;
			linha = buffRead.readLine();
		}
		
		buffRead.close();
	}

}
