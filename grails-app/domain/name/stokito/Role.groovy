package name.stokito

class Role {

	String authority

	static mapping = {
		cache true
        table '`role`'
	}

	static constraints = {
		authority blank: false, unique: true
	}
}
