package tedu.day1001;

public class Transformer {
	private Weapon w;
	
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	public void attack() {
		System.out.println("���ν�տ�ʼ����");
		if(w == null) {
			System.out.println("����ҧ");
			return;
		}
		
		String type="";
		switch(w.getType()) {
		case Weapon.TYPE_COLD:type="�����";break;
		case Weapon.TYPE_HOT:type="�ȱ���";break;
		case Weapon.TYPE_NUCLEAR:type="������";break;
		}
		
		System.out.println(
		 "ʹ��"+type+w.getName()+"����");
		w.kill();
	}
}



