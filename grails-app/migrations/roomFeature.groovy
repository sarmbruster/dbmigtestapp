databaseChangeLog = {

	changeSet(author: "stefan (generated)", id: "1300371056030-1") {
		createTable(tableName: "room") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "roomPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "stefan (generated)", id: "1300371056030-2") {
		addColumn(tableName: "event") {
			column(name: "amount", type: "double(19)") {
				constraints(nullable: "false")
			}
		}
		modifySql{  // TODO: remove when http://liquibase.jira.com/browse/CORE-843 is fixed
         replace( replace: 'DOUBLE(19)', 'with': 'NUMERIC(19,2)')
	    }
	}

	changeSet(author: "stefan (generated)", id: "1300371056030-3") {
		addColumn(tableName: "event") {
			column(name: "room_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "stefan (generated)", id: "1300371056030-4") {
		addForeignKeyConstraint(baseColumnNames: "room_id", baseTableName: "event", constraintName: "FK5C6729A478820CE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "room", referencesUniqueColumn: "false")
	}
}
