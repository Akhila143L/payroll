package com.infinite.pay;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PayRollDAO {
	
SessionFactory sessionFactory;

public String addEmploy(Employ employ) {
	sessionFactory = SessionHelper.getConnection();
	Session session = sessionFactory.openSession();
	Criteria cr =session.createCriteria(Employ.class);
	cr.add(Restrictions.eq("Empno", Empno()));
	Transaction transaction = session.beginTransaction();
	int Empno= Empno();
	employ.setEmpno(Empno);	
	int salary =employ.getSalary();
	double hra = employ.setHra(0.02*salary);
	double da = employ.setDa(0.0125*salary);
	double ta = employ.setTa(0.0095*salary);
	double tax = employ.setTax(0.023*salary);
	double pf = employ.setPf(0.03*salary);
	double gross= employ.setGross(salary+hra+da+ta);
	double netPay=employ.setNetPay(gross-tax-pf);
	employ.setLeaveAvailable(16);
	session.save(employ);
	transaction.commit();
	session.close();
	return "Employ Added";
}
private String Ename() {
	return null;
}
private int Empno() {
	return 0;
}
public java.sql.Date convertDate(String dt) throws ParseException{
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
   java.util.Date d1 =  sdf.parse(dt);
  return new java.sql.Date(d1.getTime());
    
}
  public String addLeave(LeaveTable leave){
               sessionFactory=SessionHelper.getConnection();
      Session session =sessionFactory.openSession();
      long sdate = leave.getLeaveStartDate().getTime();
      long edate = leave.getLeaveEndDate().getTime();
      long diff = edate - sdate;
      long b = diff/(1000*24*60*60);
      int days=(int)b;
      days=days+1;
      leave.setNoOfDays(days);
      double no=leave.getNoOfDays();
      
      if(no>3){
          
          leave.setLossOfPay(no-3);
          
      }else{
          leave.setLossOfPay(0);
      }
      
      Transaction tran=session.beginTransaction();
      session.save(leave);
      tran.commit();
          return "Apply Leave Successfully...";
          
  }
}


