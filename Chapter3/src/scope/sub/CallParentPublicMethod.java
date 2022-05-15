package scope.sub; //scopeパッケージのサブパッケージ

import scope.PackagePrivate; //アクセスできないためコンパイルエラー

public class CallParentPublicMethod {
	public void call() {
		PackagePrivate parent = new PackagePrivate();
		System.out.println(parent.say());
	}
}}
