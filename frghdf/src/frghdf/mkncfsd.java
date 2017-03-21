package frghdf;

 abstract class mkncfsd extends Exception {

	int a, b;

	public mkncfsd(int a, int b) {
		this.a = a;
		this.b = b;
		wmkncfsd();
	}

	public abstract void maan(int age);

	private final void wmkncfsd() {
		int sum = a + b;
		maan(sum);
	}
}
