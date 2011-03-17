package de.ggg

class Speaker {

	String name

	static hasMany = [ talks: Event ]

    static constraints = {
    }
}
