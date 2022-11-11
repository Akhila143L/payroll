package com.infinite.pay;


import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LeaveTable")
public class LeaveTable {

	@Id
	@Column(name="LeaveId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int leaveId;
	
	@Column(name="Empno")
	private int empno;
	
	@Column(name="LeaveStartDate")
	private Date leaveStartDate;
	
	@Column(name="LeaveEndDate")
	private Date leaveEndDate;
	
	@Column(name="NoOfDays")
	private int noOfDays;
	
	@Column(name="LeaveReason")
	private String leaveReason;
	
	@Column(name="LossOfPay")
	private double lossOfPay;

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public Date getLeaveStartDate() {
		return leaveStartDate;
	}

	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public Date getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public double getLossOfPay() {
		return lossOfPay;
	}

	public double setLossOfPay(double d) {
		return this.lossOfPay = d;
	}



	public LeaveTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaveTable(int leaveId, int empno, Date leaveStartDate, Date leaveEndDate, int noOfDays,
			String leaveReason, int lossOfPay, int salary) {
		super();
		this.leaveId = leaveId;
		this.empno = empno;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.noOfDays = noOfDays;
		this.leaveReason = leaveReason;
		this.lossOfPay = lossOfPay;
	}

	@Override
	public String toString() {
		return "LeaveTable [leaveId=" + leaveId + ", empno=" + empno + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", noOfDays=" + noOfDays + ", leaveReason=" + leaveReason
				+ ", lossOfPay=" + lossOfPay + "]";
	}
	

	
}
