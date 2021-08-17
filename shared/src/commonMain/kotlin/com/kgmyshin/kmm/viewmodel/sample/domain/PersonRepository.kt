package com.kgmyshin.kmm.viewmodel.sample.domain

import com.benasher44.uuid.Uuid
import com.benasher44.uuid.uuid4

class AnimalRepository {
    suspend fun findAll(): List<Person> = MASTER
}

private val uuid4: Uuid = uuid4()

private val MASTER: List<Person> = listOf(
    "Adrian",
    "Albert",
    "Alexander",
    "Xander",
    "Alfred",
    "Fred",
    "Freddy",
    "Andrew",
    "Drew",
    "Anthony",
    "Arnold",
    "Arne",
    "Arthur",
    "Benjamin",
    "Benji",
    "Benny",
    "Charles",
    "Chuck",
    "Christian",
    "Christopher",
    "Daniel",
    "Dan",
    "David",
    "Davy",
    "Donald",
    "Donny",
    "Edward",
    "Eddy",
    "Ted",
    "Ned",
    "Eric",
    "Ricky",
    "Eugene",
    "Ernest",
    "Ern",
    "Francis",
    "Franky",
    "Frederick",
    "Freddy",
    "Gabriel",
    "Gabby",
    "Gilbert",
    "Geoffrey",
    "",
    "Gerald",
    "Gregory",
    "Harold",
    "Hal",
    "Henry",
    "Hank",
    "Isaac",
    "Zak",
    "Jacob",
    "James",
    "Jimmy",
    "Jammy",
    "John",
    "Jacky",
    "Johnny",
    "Joseph",
    "Joey",
    "Joshua",
    "Kenneth",
    "Kenny",
    "Laurence",
    "Leonard",
    "Leo",
    "Leslie",
    "Martin",
    "Matthew",
    "Matty",
    "Michael",
    "Mikey",
    "Mick",
    "Micky",
    "Mitchell",
    "Nathan",
    "Nicolas",
    "Patrick",
    "Rick",
    "Ricky",
    "Peter",
    "Philip",
    "Randall",
    "Randolph",
    "Raymond",
    "Richard",
    "Rick",
    "Ricky",
    "Richie",
    "Robert",
    "Bobby",
    "Rob",
    "Robby",
    "Ronald",
    "Ronny",
    "Samuel",
    "Sammy",
    "Stanley",
    "Stephen",
    "Stewart",
    "Terrence",
    "Theodore",
    "Teddy",
    "Theo",
    "Thomas",
    "Tommy",
    "Timothy",
    "Victor",
    "Vickie",
    "Vincent",
    "Vinny",
    "Walter",
    "Wally",
    "Wallace",
    "William",
    "Billy",
    "Will",
    "Willie",
    "Zachary",
    "Abigail",
    "Adrienne",
    "Alexandra",
    "Allie",
    "Alice",
    "Allie",
    "Ellie",
    "Elsie",
    "Allison",
    "Allie",
    "Angela",
    "Angelina",
    "Barbara",
    "Beatrice",
    "Triss",
    "Catherine",
    "Cathreen",
    "Kathryn",
    "Cath",
    "Cathy",
    "Katie",
    "Kitty",
    "Christin",
    "Christina",
    "Deborah",
    "Debbie",
    "Desiree",
    "Dolores",
    "Lola",
    "Loli",
    "Dolly",
    "Dorothy",
    "ElizabethBeth",
    "Betty",
    "Liz",
    "Liza",
    "Lisa",
    "Eliza",
    "Ellen",
    "Emma",
    "Jennifer",
    "Jenny",
    "Jessica",
    "Joan",
    "Joann",
    "Josephine",
    "Kimberly",
    "Kimmy",
    "Lucille",
    "Magan",
    "Margaret",
    "Meg",
    "Peg",
    "Peggy",
    "Mary",
    "Molly",
    "May",
    "Nicole",
    "Nicky",
    "Pamera",
    "Patricia",
    "Paty",
    "Trish",
    "Rebecca",
    "Becky",
    "Samantha",
    "Stephanie",
    "Steffie",
    "Sandra",
    "Sophia",
    "FiFi",
    "Soph",
    "Sophie",
    "Susanna",
    "Susie",
    "Sue",
    "Tiffany",
    "Victoria"
).map { name ->
    Person(
        PersonId(uuid4.toString()),
        name
    )
}