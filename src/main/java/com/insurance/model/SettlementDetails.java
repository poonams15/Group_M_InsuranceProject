package com.insurance.model;

//Task- 175 Design web service to add the settlement details once claim is done ------>
//@author----->Poonam Patil

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "settlementDetails")
public class SettlementDetails {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int settlementId;
		private Date date;
		private float amount;
		private String claimId;
		private String status;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getSettlementId() {
			return settlementId;
		}

		public void setSettlementId(int settlementId) {
			this.settlementId = settlementId;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public float getAmount() {
			return amount;
		}

		public void setAmount(float amount) {
			this.amount = amount;
		}

		public String getClaimId() {
			return claimId;
		}

		public void setClaimId(String claimId) {
			this.claimId = claimId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

}
