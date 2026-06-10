-- Last updated: 6/11/2026, 1:30:33 AM
select firstName,lastName,city,state from Person LEFT JOIN Address on Person.personId=Address.PersonId;