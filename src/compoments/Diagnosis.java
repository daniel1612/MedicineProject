package compoments;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import application.Status;

public class Diagnosis {

	private HashMap<String, String> temp = new HashMap<>();
	private HashMap<String, Integer> diseases = new HashMap<>();
	private HashMap<String, Integer> indexDiseases = new HashMap<>();
	private String [] AllDiseases = {"�����","�����","�����","������ ���","��� ��","����� ���������","����� ����",
			"��������","�����","���� ����������","���� �������","����� ����� ����","���� ��", "���� ��","���� ���","���� ����","����� �����","����� ����","������","���� �����",
			"����� �����","����� �������","����","����� ������ �� ���","�� �����","������ �����"};

	private Patient p;
	private String disease ,treatment;
	
	private WriteAndReadFile wr = new WriteAndReadFile("C:/Users/roniz/eclipse-workspace/MedicineProject/src/compoments/Diagnosis.txt");

	public Diagnosis(Patient p) {
		for(String s : AllDiseases) 
			diseases.put(s, 0);
		for(int i = 1; i <= AllDiseases.length ; i++)
			indexDiseases.put(AllDiseases[i-1], i);
		this.p = p;
	}

	public void clearTemp() {
		temp.clear();
	}
	
	
	public void start() {

		//WBC 
		if(!p.getIndices().get("WBC")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("WBC")[0].equals(Status.HIGHT.toString())) {
				diseases.put("�����", diseases.get("�����") + 1);
				diseases.put("���� ��", diseases.get("���� ��") + 1);
				diseases.put("����", diseases.get("����") + 1);
			}else if(p.getIndices().get("WBC")[0].equals(Status.LOW.toString())) {
				diseases.put("���� �������", diseases.get("�����") + 1);
				diseases.put("����", diseases.get("����") + 1);
			}	
		}
		//Neut
		if(!p.getIndices().get("NEUT")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("NEUT")[0].equals(Status.HIGHT.toString())) {
				diseases.put("�����", diseases.get("�����") + 1);
			}else if(p.getIndices().get("NEUT")[0].equals(Status.LOW.toString())) {
				diseases.put("�����", diseases.get("�����") + 1);
				diseases.put("��� ��", diseases.get("��� ��") + 1);
				diseases.put("����", diseases.get("����") + 1);
			}
		}
		//Lymph
		if(!p.getIndices().get("Lymph")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("Lymph")[0].equals(Status.HIGHT.toString())) {
				diseases.put("�����", diseases.get("�����") + 1);
				diseases.put("����", diseases.get("����") + 1);
			}else if(p.getIndices().get("Lymph")[0].equals(Status.LOW.toString())) {
				diseases.put("��� ��", diseases.get("��� ��") + 1);
			}
		}
		//RBC
		if(!p.getIndices().get("RBC")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("RBC")[0].equals(Status.HIGHT.toString())) {
				diseases.put("������", diseases.get("������") + 1);
				diseases.put("���� �����", diseases.get("���� �����") + 1);
				diseases.put("��� ��", diseases.get("��� ��") + 1);
			}else if(p.getIndices().get("RBC")[0].equals(Status.LOW.toString())) {
				diseases.put("�����", diseases.get("�����") + 1);
				diseases.put("�����", diseases.get("�����") + 1);
			}
		}
		//HCT
		if(!p.getIndices().get("HCT")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("HCT")[0].equals(Status.HIGHT.toString())) {
				diseases.put("������", diseases.get("������") + 1);
			}else if(p.getIndices().get("HCT")[0].equals(Status.LOW.toString())) {
				diseases.put("�����", diseases.get("�����") + 1);
				diseases.put("�����", diseases.get("�����") + 1);
			}
		}
		//Urea
		if(!p.getIndices().get("Urea")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("Urea")[0].equals(Status.HIGHT.toString())) {
				diseases.put("���� ����", diseases.get("���� ����") + 1);
				diseases.put("��������", diseases.get("��������") + 1);
				diseases.put("�����", diseases.get("�����") + 1);
			}else if(p.getIndices().get("Urea")[0].equals(Status.LOW.toString())) {
				diseases.put("�� �����", diseases.get("�� �����") + 1);
				diseases.put("�����", diseases.get("�����") + 1);
				diseases.put("���� ���", diseases.get("���� ���") + 1);
			}
		}
		//hb
		if(!p.getIndices().get("Hb")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("Hb")[0].equals(Status.LOW.toString())) {
				diseases.put("�����", diseases.get("�����") + 1);
				diseases.put("����� ���������", diseases.get("����� ���������") + 1);
				diseases.put("����� ����", diseases.get("����� ����") + 1);
				diseases.put("�����", diseases.get("�����") + 1);
			}
		}
		//Creatinine
		if(!p.getIndices().get("Creatinine")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("Creatinine")[0].equals(Status.HIGHT.toString())) {
				diseases.put("���� ����", diseases.get("���� ����") + 1);
				diseases.put("����� ����", diseases.get("����� ����") + 1);
				diseases.put("����� ������ �� ���", diseases.get("����� ������ �� ���") + 1);
			}else if(p.getIndices().get("Creatinine")[0].equals(Status.LOW.toString())) {
				diseases.put("�� �����", diseases.get("�� �����") + 1);
				diseases.put("����� ����", diseases.get("����� ����") + 1);
			}
		}
		//Iron
		if(!p.getIndices().get("Iron")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("Iron")[0].equals(Status.HIGHT.toString())) {
				diseases.put("����� ����", diseases.get("����� ����") + 1);
			}else if(p.getIndices().get("Iron")[0].equals(Status.LOW.toString())) {
				diseases.put("�� �����", diseases.get("�� �����") + 1);
				diseases.put("�����", diseases.get("�����") + 1);
			}
		}
		//HDL
		if(!p.getIndices().get("HDL")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("HDL")[0].equals(Status.LOW.toString())) {
				diseases.put("���� ��", diseases.get("���� ��") + 1);
				diseases.put("������ ���", diseases.get("������ ���") + 1);
				diseases.put("����� �������", diseases.get("����� �������") + 1);
			}
		}
		//AP
		if(!p.getIndices().get("AP")[0].equals(Status.NORMAL.toString())) {
			if(p.getIndices().get("AP")[0].equals(Status.HIGHT.toString())) {
				diseases.put("���� ���", diseases.get("���� ���") + 1);
				diseases.put("����� ����� ����", diseases.get("����� ����� ����") + 1);
				diseases.put("����� �����", diseases.get("����� �����") + 1);
				diseases.put("������ �����", diseases.get("������ �����") + 1);
			}else if(p.getIndices().get("AP")[0].equals(Status.LOW.toString())) {
				diseases.put("�� �����", diseases.get("�� �����") + 1);
				diseases.put("���� ����������", diseases.get("���� ����������") + 1);
			}
		}

		// Q1
		if(p.isSmoke()) {
			diseases.put("������", diseases.get("������") + 1);
			if(!p.getIndices().get("WBC")[0].equals(Status.NORMAL.toString())) {   // �� ����� ������ ������� ������ �� ����
				diseases.put("����", diseases.get("����") + 1);

			}
			if(p.getIndices().get("NEUT")[0].equals(Status.LOW.toString())) {   
				diseases.put("����", diseases.get("����") + 1);

			}
			if(p.getIndices().get("Lymph")[0].equals(Status.HIGHT.toString())) { 
				diseases.put("����", diseases.get("����") + 1);

			}
			if(p.getIndices().get("RBC")[0].equals(Status.HIGHT.toString())) { 
				diseases.put("������", diseases.get("������") + 1);
				diseases.put("���� �����", diseases.get("���� �����") + 1);
			}
			if(p.getIndices().get("HCT")[0].equals(Status.HIGHT.toString())) { 
				diseases.put("������", diseases.get("������") + 1);

			}	
		}

		// Q2
		if(p.isTired()) {
			if(p.getIndices().get("Urea")[0].equals(Status.HIGHT.toString())) {   
				diseases.put("��������", diseases.get("��������") + 1);
			}
			if(p.getIndices().get("Hb")[0].equals(Status.LOW.toString())) {
				diseases.put("����� �����", diseases.get("����� �����") + 1);
			}
			if(p.getIndices().get("Creatinine")[0].equals(Status.LOW.toString())) {
				diseases.put("�� �����", diseases.get("�� �����") + 1);
			}
			if(p.getIndices().get("Iron")[0].equals(Status.LOW.toString())) {
				diseases.put("����� ����", diseases.get("����� ����") + 1);
				diseases.put("�� �����", diseases.get("�� �����") + 1);
			}
			if(p.getIndices().get("AP")[0].equals(Status.LOW.toString())) { 
				diseases.put("�� �����", diseases.get("�� �����") + 1);
				diseases.put("���� ����������", diseases.get("���� ����������") + 1);
			}


		}
		// Q3
		if(p.isHeart_diseases()) {
			if(p.getIndices().get("HDL")[0].equals(Status.LOW.toString())) { 
				diseases.put("���� ��", diseases.get("���� ��") + 1);

			}

		}
		// Q4
		if(p.isStomach_pain()) {
			if(p.getIndices().get("Creatinine")[0].equals(Status.HIGHT.toString())) { 
				diseases.put("����� ����", diseases.get("����� ����") + 1);

			}		
		}

		// Q5
		if(p.isDrinkingAlcohol()) {
			if(p.getIndices().get("Urea")[0].equals(Status.LOW.toString())) { 
				diseases.put("���� ���", diseases.get("���� ���") + 1);

			}
			if(p.getIndices().get("AP")[0].equals(Status.HIGHT.toString())) { 
				diseases.put("���� ���", diseases.get("���� ���") + 1);
			}

		}

		// Q6
		if(p.isDrugSensitive()) {
			if(p.getIndices().get("AP")[0].equals(Status.LOW.toString())) { 
				diseases.put("������ �����", diseases.get("������ �����") + 1);

			}
		}

		// Q7
		if(p.isPregnant() && p.getGender()=="WOMAN") {
			if(p.getIndices().get("Iron")[0].equals(Status.LOW.toString())) { 
				diseases.put("����� �����", diseases.get("����� �����") + 1);
			}
		}
	}

	public HashMap<String, String> dises() {
		int count = count();
		System.err.println("How many diese: " + count);
		if(count > 1) {
			for(int i = 0 ; i < count; i++) {
				disease = BringMax();
				treatment = MsgTreatment(indexDiseases.get(disease));
				temp.put(disease, treatment);
				System.err.println("dises is: " + disease);
				diseases.remove(disease);
				
			}
		}else if(count != 0){
			disease = BringMax();
			treatment = MsgTreatment(indexDiseases.get(disease));
			temp.put(disease, treatment);
			diseases.remove(disease);
		}else {
			temp.put("�� ����� ����", "������ ��� ������");
		}
		wr.WriteFileString(temp);
		return temp;	
	}

	private int count() {
		int maxValue = (Collections.max(diseases.values()));
		int count = 0;
		if(maxValue != 0) {
			for(Entry<String, Integer> entry : diseases.entrySet()) {
				if(entry.getValue() == maxValue)
					count++;
			}
			System.out.println("maxvalue = " + maxValue + ", countDieses = " + count);
			return count;
		}		
		System.out.println("maxvalue = " + maxValue + ", countDieses = " + count);
		return count;

	}

	private String BringMax() {
		int maxValue = (Collections.max(diseases.values()));
		for(Entry<String, Integer> entry : diseases.entrySet()) {
			if(entry.getValue() == maxValue)
				return entry.getKey();
		}
		return null;

	}


	private String MsgTreatment(int index) {
		switch (index) {
		case 1: 
			return "��� ����� 10 �'� �� B12 ���� ���� ����.";
		case 2: 
			return "���� ����� �� ������";

		case 3: 
			return "������� ������� ���� ������";

		case 4: 
			return "���� ����� �� ������, ���� 5 �'� �� ������� ���� ���� ����.";

		case 5: 
			return "���� 10 �\"� �� B12 ���� ���� ����\r\n"
			+ "���� 5 �\"� �� ����� ����� ���� ���� ����";

		case 6: 
			return " ����� �� ������ ������ ����� ��� ��� �������";

		case 7: 
			return "������� ���� ������";

		case 8: 
			return "����� ������ ������, ����� ������ ������";

		case 9: 
			return "����������� �������";

		case 10: 
			return "������ ������ �� ������ ���������� ������";

		case 11: 
			return "���� ����";

		case 12: 
			return "������ ������ �������";

		case 13: 
			return "���� ����� �� ������";

		case 14: 
			return "����� �� ������������� ����������������";

		case 15: 
			return "������ ������ ������� ����� ����� �����";

		case 16: 
			return "����� �� ���� ����� ���";

		case 17: 
			return " ��� ����� 10 �\"� �� B12 ���� ���� ����";

		case 18: 
			return "��� ����� 5 �\"� �� ������ c3 �� ����� ���� ���� ����";

		case 19: 
			return "������ ����";

		case 20: 
			return "������ ���� / ������ ������ ����� �� ������";

		case 21: 
			return "Propylthiouracil ������ ������ ����� �����";

		case 22: 
			return "����� �������� ������";

		case 23: 
			return "����������";

		case 24: 
			return " ���� ����� �� ������";

		case 25: 
			return "������ ����� ������ ����� ����� ����� ��� �������";

		case 26: 
			return "���� ����� �� ������";

		default:
			throw new IllegalArgumentException("Unexpected value: " + index);
		}
	}

	@Override
	public String toString() {
		return temp.toString();
	}

}



