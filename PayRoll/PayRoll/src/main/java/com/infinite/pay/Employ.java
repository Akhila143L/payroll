package com.infinite.pay;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employ {

	@Id
	@Column(name="Empno")
	private int empno;
	
	@Column(name="Ename")
	private String ename;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Gender")
	private Gender gender;
	
	@Column(name="Salary")
	private int salary;

	@Column(name="Hra")
	private double hra;
	
	@Column(name="da")
	private double Da;
	
	@Column(name="Ta")
	private double ta;
	
	@Column(name="Tax")
	private double tax;
	
	@Column(name="Pf")
	private double pf;
	
	@Column(name="Gross")
	private double gross;
	
	@Column(name="NetPay")
	private double netPay;
	
	@Column(name="LeaveAvailable")
	private int leaveAvailable;


	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employ(int empno, String ename, Gender gender, int salary, double hra, double da, double ta, double tax,
			double pf, double gross, double netPay, int leaveAvailable, int basic) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.salary = salary;
		this.hra = hra;
		Da = da;
		this.ta = ta;
		this.tax = tax;
		this.pf = pf;
		this.gross = gross;
		this.netPay = netPay;
		this.leaveAvailable = leaveAvailable;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", ename=" + ename + ", gender=" + gender + ", salary=" + salary + ", hra="
				+ hra + ", Da=" + Da + ", ta=" + ta + ", tax=" + tax + ", pf=" + pf + ", gross=" + gross + ", netPay="
				+ netPay + ", leaveAvailable=" + leaveAvailable +  "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getHra() {
		return hra;
	}

	public double setHra(double hra) {
		return this.hra = hra;
	}

	public double getDa() {
		return Da;
	}

	public double setDa(double da) {
		return this.Da = da;
	}

	public double getTa() {
		return ta;
	}

	public double setTa(double ta) {
		return this.ta = ta;
	}

	public double getTax() {
		return tax;
	}

	public double setTax(double tax) {
		return this.tax = tax;
	}

	public double getPf() {
		return pf;
	}

	public double setPf(double pf) {
		return this.pf = pf;
	}

	public double getGross() {
		return gross;
	}

	public double setGross(double gross) {
		return this.gross = gross;
	}

	public double getNetPay() {
		return netPay;
	}

	public double setNetPay(double netPay) {
		return this.netPay = netPay;
	}

	public int getLeaveAvailable() {
		return leaveAvailable;
	}

	public void setLeaveAvailable(int leaveAvailable) {
		this.leaveAvailable = leaveAvailable;
	}


	

	
}
