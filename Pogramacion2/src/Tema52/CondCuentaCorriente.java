package Tema52;

public class CondCuentaCorriente {
	
	public static void main(String[] args) {
		CuentaCorriente emp = new CuentaCorriente("david",100,"01234567");
		System.out.println(emp.getSaldo());
		emp.sumSaldo(200);
		System.out.println(emp.getSaldo());
		emp.retiraSaldo(100);
		System.out.println(emp.getSaldo());
}}
