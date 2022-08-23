package com.TesteTec.testetec.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_Licenca")
public class Licenca {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String licenca;
		private String Dt_inicial;
		private String Dt_Final;
		
		@ManyToOne
		@JoinColumn(name = "produtos_id")		
		private Produtos produtos;
		
		public Licenca() {
			
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getLicenca() {
			return licenca;
		}

		public void setLicenca(String licenca) {
			this.licenca = licenca;
		}

		public String getDt_inicial() {
			return Dt_inicial;
		}

		public void setDt_inicial(String dt_inicial) {
			Dt_inicial = dt_inicial;
		}

		public String getDt_Final() {
			return Dt_Final;
		}

		public void setDt_Final(String dt_Final) {
			Dt_Final = dt_Final;
		}

		public Produtos getProdutos() {
			return produtos;
		}

		public void setProdutos(Produtos produtos) {
			this.produtos = produtos;
		}
		

}
