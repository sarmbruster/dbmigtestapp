package de.ggg

class Room {

	String name

	static hasMany = [events: Event]

    static constraints = {
    }
}
