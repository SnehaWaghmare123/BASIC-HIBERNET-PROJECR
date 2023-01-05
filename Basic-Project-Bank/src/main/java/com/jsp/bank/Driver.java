package com.jsp.bank;

import java.util.List;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1 For Employee and 2 For User 3 For Admin");
		int i = sc.nextInt();
		if (i == 1) {
			System.out.println("If already account is having select 1 or To  create account select 2");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("Enter Employeename");
				String name = sc.next();
				System.out.println("Enter password");
				String password = sc.next();
				HelperClass em = new HelperClass();
				Employee e = new Employee();
				List<Employee> e1 = em.GetAllEmployee(e);
				for (Employee emp : e1) {
					int count=0;
					if (name.equals(emp.getEmpname()) && password.equals(emp.getPassword())) {
						count++;
						System.out.println("Employee Login");
						System.out.println("NOW SELECT 1 FOR CHECK BALANCE 2 FOR CHECK HISTORY 3 for UPDATE 4  FOR How MANY ACCOUNT ARE THERE");
						int b = sc.nextInt();
						if (b == 1) {
							HelperClass hp = new HelperClass();
							User d = new User();
							List<User> u1 = hp.GetAllUser(d);
							int sum = 0;
							for (User u : u1) {
								sum = sum + u.getAmount();
						}} else if (b == 2) {
							// check history
						} else if (b == 3) {
							HelperClass hp = new HelperClass();
							e.setId(emp.getId());
							System.out.println("Enter Empname");
							e.setEmpname(sc.next());
							System.out.println("Enter password");
							e.setPassword(sc.next());
							System.out.println("Enter emailid");
							e.setEmailid(sc.next());
							System.out.println("Enter role");
							e.setRole(sc.next());
							System.out.println("All good");
							hp.HelperClassUpdateEmp(e);
						} else if (b == 4) {
							HelperClass em1 = new HelperClass();
							User d = new User();
							List<User> u1 = em.GetAllUser(d);
							int account = 0;
							int count1=0;
							for (User u : u1) {
								count1++;
						}
							System.out.println("TOTAL ACCOUNT IN THIS BANK="+count1);}
						else {
							System.out.println("INVILD NUMBER");
						}
					} if(count==0) {System.out.println("INVILD USERNAME OR PASSWORD");
					}}
				
			}else {
				HelperClass hp = new HelperClass();
				Employee s = new Employee();
				System.out.println("Enter EmpId");
				s.setId(sc.nextInt());
				System.out.println("Enter Empname");
				s.setEmpname(sc.next());
				System.out.println("Enter password");
				s.setPassword(sc.next());
				System.out.println("Enter emailid");
				s.setEmailid(sc.next());
				System.out.println("Enter role");
				s.setRole(sc.next());
				hp.HelperClassUpdateEmp(s);
				System.out.println("Employee Login");
				System.out.println("NOW SELECT 1 FOR CHECK BALANCE 2 FOR How MANY ACCOUNT ARE THERE 3 FOR CHECK HISTORY");
				int b = sc.nextInt();
				if (b == 1) {
					HelperClass hp1 = new HelperClass();
					User d = new User();
					List<User> u1 = hp1.GetAllUser(d);
					int sum = 0;
					for (User u : u1) {
						sum = sum + u.getAmount();
				} }else if (b == 2) {
					HelperClass em = new HelperClass();
					User d = new User();
					List<User> u1 = em.GetAllUser(d);
					int account = 0;
					for (User u : u1) {
						account = account + u.getId();
				}System.out.println("TOTAL ACCOUNT IN THIS BANK="+account);
					}else if (b == 3) {
//	check history

				} else {
					System.out.println("INVILD NUMBER");
				}
			}}
		else if (i == 2) {
			System.out.println("If already account is having select 1 or To  create account select 2");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("Enter Username");
				String name = sc.next();
				System.out.println("Enter password");
				String password = sc.next();
				HelperClass emp1 = new HelperClass();
				User e = new User();
				List<User> e1 = emp1.GetAllUser(e);
				for (User emp : e1) {
					if (name.equals(emp.getUsername()) && password.equals(emp.getPassword())) {
						System.out.println("Employee Login");
						System.out.println("NOW SELECT 1 FOR CHECK BALANCE 2 FOR CHECK HISTORY 3 for update 4 FOR DIPOST 5 FOR WITHDRAWAL");
						int b = sc.nextInt();
						if (b == 1) {
							HelperClass em = new HelperClass();
							User d = new User();
							List<User> u1 = em.GetAllUser(d);
							for (User u : u1) {
								if (name.equals(emp.getUsername()) && password.equals(emp.getPassword())) {
									int account = u.getAmount();
									System.out.println("Your Account Balance is" + account);
								}
							}
						} else if (b == 2) {
							// check history
						} else if (b == 3) {
							HelperClass hp = new HelperClass();
							e.setId(emp.getId());
							System.out.println("Enter Empname");
							e.setUsername(sc.next());
							System.out.println("Enter password");
							e.setPassword(sc.next());
							System.out.println("Enter emailid");
							e.setEmailid(sc.next());
							System.out.println("Enter Type");
							e.setType(sc.next());
							System.out.println("All good");
							hp.HelperClassUpdateUser(e);
						} else if (b == 4) {
							HelperClass hp = new HelperClass();
							int eamount=emp.getAmount();
							System.out.println("Enter Amount");
							int acc=sc.nextInt();
							e.setAmount(eamount+acc);
							e.setId(emp.getId());
							e.setUsername(emp.getUsername());
							e.setPassword(emp.getPassword());
							e.setEmailid(emp.getEmailid());
							e.setType(emp.getType());
							hp.HelperClassUpdateUser(e);
						} else if (b == 5) {
							HelperClass hp = new HelperClass();
							int eamount=emp.getAmount();
							System.out.println("Enter Amount TO WITHDRAWAL");
							int acc=sc.nextInt();
							e.setAmount(eamount-acc);
							e.setId(emp.getId());
							e.setUsername(emp.getUsername());
							e.setPassword(emp.getPassword());
							e.setEmailid(emp.getEmailid());
							e.setType(emp.getType());
							hp.HelperClassUpdateUser(e);
						} else {
							System.out.println("INVILD NUMBER");
						}
						}
					}} else {
						User u1 = new User();
						System.out.println("Enter UserId");
						u1.setId(sc.nextInt());
						System.out.println("Enter Username");
						u1.setUsername(sc.next());
						System.out.println("Enter password");
						u1.setPassword(sc.next());
						System.out.println("Enter emailid");
						u1.setEmailid(sc.next());
						System.out.println("Enter AccountType if Saving or Current");
						u1.setType(sc.next());
						System.out.println("Enter Amount");
						u1.setAmount(sc.nextInt());
						HelperClass hp = new HelperClass();
						hp.HelperClassUser(u1);
						System.out.println("User Login");
						
					}

		}
			else if (i == 3) {
			System.out.println(" 1 for check account 2 for delete emp 3 for delete user");
			Scanner sc1=new Scanner(System.in);
			int s = sc1.nextInt();
			if (s == 1) {
				HelperClass em = new HelperClass();
				User d = new User();
				List<User> u1 = em.GetAllUser(d);
				int sum = 0;
				for (User u : u1) {
					sum = sum + u.getAmount();
				}
				System.out.println("Total Amount  in you Bank =" + sum);
			} else if (s == 2) {
				HelperClass h1 = new HelperClass();
				System.out.println("Account number to delete for employee");
				int d = sc1.nextInt();
				h1.HelperClassDeleteEmp(d);
				System.out.println("Account number is delete for employee");
			} else if (s == 3) {
				HelperClass h1 = new HelperClass();
				System.out.println("Account number to delete for User");
				int d = sc1.nextInt();
				h1.HelperClassDeleteUser(d);
				System.out.println("Account number is delete for employee");
			} else {
				System.out.println("Account number is invild ");
			}
		}
	}
}
	