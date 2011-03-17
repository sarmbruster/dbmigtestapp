databaseChangeLog = {

	changeSet(author: "stefan (generated)", id: "1300368282415-1") {
		createTable(tableName: "event") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "eventPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date", type: "timestamp") {
				constraints(nullable: "false")
			}

			column(name: "speaker_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "stefan (generated)", id: "1300368282415-2") {
		createTable(tableName: "speaker") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "speakerPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "stefan (generated)", id: "1300368282415-3") {
		addForeignKeyConstraint(baseColumnNames: "speaker_id", baseTableName: "event", constraintName: "FK5C6729A83ACC7E6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "speaker", referencesUniqueColumn: "false")
	}
}
