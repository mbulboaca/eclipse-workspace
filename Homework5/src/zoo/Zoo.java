package zoo;

 public class Zoo {

	 Animals[] list;

	public Zoo(Animals[] list) {
		this.list = list;
	} 
	 
	public void describeAll() {
		for(int i = 0; i < list.length; i++) {
			if(list[i] != null) {
				System.out.println(list[i]);
				list[i].origin();
			}
		}
	}
}