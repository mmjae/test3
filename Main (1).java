public class Main
{
	public static void main(String[] args)
	{
		// ���������� �������� ����� ��Ʈ�� Ŭ������ �ν��Ͻ�����
		EmployeeHandler handler=new EmployeeHandler();

		handler.aAddEmployee(new PermanentWorker("KIM", 1000));   //������ ���
		handler.addEmployee(new PermanentWorker("LEE", 1500));

		TemporaryWorker alba=new TemporaryWorker("Jung", 700);	
		alba.addWorkTime(5);									// 5�ð� ���Ѱ�� ���
		handler.addEmployee(alba);								//�ӽ��� ���	
		
		SalesWorker seller=new SalesWorker("Hong", 1000, 0.1);
		seller.addSalesResult(7000);	        // �������� 7000
		handler.addEmployee(seller);

		handler.showAllSalaryInfo();  	// �̹� �޿� �����ؾ� �� �޿��� ����	
		handler.showTotalSalary();			// �̹� �޿� �����ؾ� �� �޿��� ����
	}
}

