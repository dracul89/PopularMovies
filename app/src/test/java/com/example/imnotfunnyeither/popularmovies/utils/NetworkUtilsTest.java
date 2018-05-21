package com.example.imnotfunnyeither.popularmovies.utils;

import com.example.imnotfunnyeither.popularmovies.model.PopularMovie;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NetworkUtilsTest {

    String jsonString = "{\n" +
            "  \"page\": 1,\n" +
            "  \"total_results\": 20071,\n" +
            "  \"total_pages\": 1004,\n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"vote_count\": 3274,\n" +
            "      \"id\": 299536,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 8.6,\n" +
            "      \"title\": \"Avengers: Infinity War\",\n" +
            "      \"popularity\": 560.563572,\n" +
            "      \"poster_path\": \"\\/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Avengers: Infinity War\",\n" +
            "      \"genre_ids\": [\n" +
            "        12,\n" +
            "        878,\n" +
            "        14,\n" +
            "        28\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.\",\n" +
            "      \"release_date\": \"2018-04-25\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 1732,\n" +
            "      \"id\": 337167,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6,\n" +
            "      \"title\": \"Fifty Shades Freed\",\n" +
            "      \"popularity\": 524.277801,\n" +
            "      \"poster_path\": \"\\/jjPJ4s3DWZZvI4vw8Xfi4Vqa1Q8.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Fifty Shades Freed\",\n" +
            "      \"genre_ids\": [\n" +
            "        18,\n" +
            "        10749\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/9ywA15OAiwjSTvg3cBs9B7kOCBF.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Believing they have left behind shadowy figures from their past, newlyweds Christian and Ana fully embrace an inextricable connection and shared life of luxury. But just as she steps into her role as Mrs. Grey and he relaxes into an unfamiliar stability, new threats could jeopardize their happy ending before it even begins.\",\n" +
            "      \"release_date\": \"2018-02-07\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 5113,\n" +
            "      \"id\": 284054,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.3,\n" +
            "      \"title\": \"Black Panther\",\n" +
            "      \"popularity\": 325.101397,\n" +
            "      \"poster_path\": \"\\/uxzzxijgPIY7slzFvMotPv8wjKA.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Black Panther\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        14,\n" +
            "        878\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/AlFqBwJnokrp9zWTXOUv7uhkaeq.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.\",\n" +
            "      \"release_date\": \"2018-02-13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 7209,\n" +
            "      \"id\": 269149,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.7,\n" +
            "      \"title\": \"Zootopia\",\n" +
            "      \"popularity\": 172.230926,\n" +
            "      \"poster_path\": \"\\/sM33SANp9z6rXW8Itn7NnG1GOEs.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Zootopia\",\n" +
            "      \"genre_ids\": [\n" +
            "        16,\n" +
            "        12,\n" +
            "        10751,\n" +
            "        35\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/mhdeE1yShHTaDbJVdWyTlzFvNkr.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Determined to prove herself, Officer Judy Hopps, the first bunny on Zootopia's police force, jumps at the chance to crack her first case - even if it means partnering with scam-artist fox Nick Wilde to solve the mystery.\",\n" +
            "      \"release_date\": \"2016-02-11\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 12975,\n" +
            "      \"id\": 118340,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.9,\n" +
            "      \"title\": \"Guardians of the Galaxy\",\n" +
            "      \"popularity\": 157.814767,\n" +
            "      \"poster_path\": \"\\/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Guardians of the Galaxy\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        878,\n" +
            "        12\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/bHarw8xrmQeqf3t8HpuMY7zoK4x.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser.\",\n" +
            "      \"release_date\": \"2014-07-30\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 6159,\n" +
            "      \"id\": 284053,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.4,\n" +
            "      \"title\": \"Thor: Ragnarok\",\n" +
            "      \"popularity\": 157.336316,\n" +
            "      \"poster_path\": \"\\/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Thor: Ragnarok\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        14\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/kaIfm5ryEOwYg8mLbq8HkPuM1Fo.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the prophecy of destruction to his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.\",\n" +
            "      \"release_date\": \"2017-10-25\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 513,\n" +
            "      \"id\": 427641,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 5.9,\n" +
            "      \"title\": \"Rampage\",\n" +
            "      \"popularity\": 139.962721,\n" +
            "      \"poster_path\": \"\\/30oXQKwibh0uANGMs0Sytw3uN22.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Rampage\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        878\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/wrqUiMXttHE4UBFMhLHlN601MZh.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Primatologist Davis Okoye shares an unshakable bond with George, the extraordinarily intelligent, silverback gorilla who has been in his care since birth.  But a rogue genetic experiment gone awry mutates this gentle ape into a raging creature of enormous size.  To make matters worse, it’s soon discovered there are other similarly altered animals.  As these newly created alpha predators tear across North America, destroying everything in their path, Okoye teams with a discredited genetic engineer to secure an antidote, fighting his way through an ever-changing battlefield, not only to halt a global catastrophe but to save the fearsome creature that was once his friend.\",\n" +
            "      \"release_date\": \"2018-04-12\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 4355,\n" +
            "      \"id\": 354912,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.8,\n" +
            "      \"title\": \"Coco\",\n" +
            "      \"popularity\": 122.442801,\n" +
            "      \"poster_path\": \"\\/eKi8dIrr8voobbaGzDpe8w0PVbC.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Coco\",\n" +
            "      \"genre_ids\": [\n" +
            "        12,\n" +
            "        35,\n" +
            "        10751,\n" +
            "        16\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/askg3SMvhqEl4OL52YuvdtY40Yb.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.\",\n" +
            "      \"release_date\": \"2017-10-27\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 14701,\n" +
            "      \"id\": 24428,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.5,\n" +
            "      \"title\": \"The Avengers\",\n" +
            "      \"popularity\": 120.001901,\n" +
            "      \"poster_path\": \"\\/cezWGskPY5x7GaglTTRN4Fugfb8.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"The Avengers\",\n" +
            "      \"genre_ids\": [\n" +
            "        878,\n" +
            "        28,\n" +
            "        12\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/hbn46fQaRmlpBuUrEiFqv0GDL6Y.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"When an unexpected enemy emerges and threatens global safety and security, Nick Fury, director of the international peacekeeping agency known as S.H.I.E.L.D., finds himself in need of a team to pull the world back from the brink of disaster. Spanning the globe, a daring recruitment effort begins!\",\n" +
            "      \"release_date\": \"2012-04-25\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 7846,\n" +
            "      \"id\": 198663,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7,\n" +
            "      \"title\": \"The Maze Runner\",\n" +
            "      \"popularity\": 113.092488,\n" +
            "      \"poster_path\": \"\\/coss7RgL0NH6g4fC2s5atvf3dFO.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"The Maze Runner\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        9648,\n" +
            "        878,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/lkOZcsXcOLZYeJ2YxJd3vSldvU4.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Set in a post-apocalyptic world, young Thomas is deposited in a community of boys after his memory is erased, soon learning they're all trapped in a maze that will require him to join forces with fellow “runners” for a shot at escape.\",\n" +
            "      \"release_date\": \"2014-09-10\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 5356,\n" +
            "      \"id\": 181808,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.1,\n" +
            "      \"title\": \"Star Wars: The Last Jedi\",\n" +
            "      \"popularity\": 106.465116,\n" +
            "      \"poster_path\": \"\\/kOVEVeg59E0wsnXmF9nrh6OmWII.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Star Wars: The Last Jedi\",\n" +
            "      \"genre_ids\": [\n" +
            "        14,\n" +
            "        12,\n" +
            "        878\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/bIUaCtWaRgd78SnoHJDI8TNf7Sd.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Rey develops her newly discovered abilities with the guidance of Luke Skywalker, who is unsettled by the strength of her powers. Meanwhile, the Resistance prepares to do battle with the First Order.\",\n" +
            "      \"release_date\": \"2017-12-13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 8195,\n" +
            "      \"id\": 321612,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6.8,\n" +
            "      \"title\": \"Beauty and the Beast\",\n" +
            "      \"popularity\": 106.455737,\n" +
            "      \"poster_path\": \"\\/tWqifoYuwLETmmasnGHO7xBjEtt.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Beauty and the Beast\",\n" +
            "      \"genre_ids\": [\n" +
            "        10751,\n" +
            "        14,\n" +
            "        10749\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/6aUWe0GSl69wMTSWWexsorMIvwU.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"A live-action adaptation of Disney's version of the classic tale of a cursed prince and a beautiful young woman who helps him break the spell.\",\n" +
            "      \"release_date\": \"2017-03-16\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 1843,\n" +
            "      \"id\": 333339,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.8,\n" +
            "      \"title\": \"Ready Player One\",\n" +
            "      \"popularity\": 105.675663,\n" +
            "      \"poster_path\": \"\\/pU1ULUq8D3iRxl1fdX2lZIzdHuI.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Ready Player One\",\n" +
            "      \"genre_ids\": [\n" +
            "        12,\n" +
            "        878,\n" +
            "        28\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/q7fXcrDPJcf6t3rzutaNwTzuKP1.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"When the creator of a popular video game system dies, a virtual contest is created to compete for his fortune.\",\n" +
            "      \"release_date\": \"2018-03-28\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 1350,\n" +
            "      \"id\": 274855,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 5.7,\n" +
            "      \"title\": \"Geostorm\",\n" +
            "      \"popularity\": 104.822913,\n" +
            "      \"poster_path\": \"\\/nrsx0jEaBgXq4PWo7SooSnYJTv.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Geostorm\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        878,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/79X8JkGxzc1tJMi0KxUSaPLooVg.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"After an unprecedented series of natural disasters threatened the planet, the world's leaders came together to create an intricate network of satellites to control the global climate and keep everyone safe. But now, something has gone wrong: the system built to protect Earth is attacking it, and it becomes a race against the clock to uncover the real threat before a worldwide geostorm wipes out everything and everyone along with it.\",\n" +
            "      \"release_date\": \"2017-10-13\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 9196,\n" +
            "      \"id\": 99861,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.3,\n" +
            "      \"title\": \"Avengers: Age of Ultron\",\n" +
            "      \"popularity\": 103.343745,\n" +
            "      \"poster_path\": \"\\/t90Y3G8UGQp0f0DrP60wRu9gfrH.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Avengers: Age of Ultron\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        878\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/rFtsE7Lhlc2jRWF7SRAU0fvrveQ.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"When Tony Stark tries to jumpstart a dormant peacekeeping program, things go awry and Earth’s Mightiest Heroes are put to the ultimate test as the fate of the planet hangs in the balance. As the villainous Ultron emerges, it is up to The Avengers to stop him from enacting his terrible plans, and soon uneasy alliances and unexpected action pave the way for an epic and unique global adventure.\",\n" +
            "      \"release_date\": \"2015-04-22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 507,\n" +
            "      \"id\": 445571,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.2,\n" +
            "      \"title\": \"Game Night\",\n" +
            "      \"popularity\": 101.144324,\n" +
            "      \"poster_path\": \"\\/85R8LMyn9f2Lev2YPBF8Nughrkv.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Game Night\",\n" +
            "      \"genre_ids\": [\n" +
            "        9648,\n" +
            "        35,\n" +
            "        80,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/4hU1pC7MGQ7wU9ldkRJYNHK3vgb.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Max and Annie's weekly game night gets kicked up a notch when Max's brother Brooks arranges a murder mystery party -- complete with fake thugs and federal agents. So when Brooks gets kidnapped, it's all supposed to be part of the game. As the competitors set out to solve the case, they start to learn that neither the game nor Brooks are what they seem to be. The friends soon find themselves in over their heads as each twist leads to another unexpected turn over the course of one chaotic night.\",\n" +
            "      \"release_date\": \"2018-02-22\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 1,\n" +
            "      \"id\": 510819,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 4,\n" +
            "      \"title\": \"Dirty Dead Con Men\",\n" +
            "      \"popularity\": 100.98273,\n" +
            "      \"poster_path\": \"\\/r70GGoZ5PqqokDDRnVfTN7PPDtJ.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Dirty Dead Con Men\",\n" +
            "      \"genre_ids\": [],\n" +
            "      \"backdrop_path\": \"\\/75RJi3yVZnZtVj4Kn1bYGzkhiEx.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"A cool and dangerous neo-noir crime film that revolves around the disturbed lives of two unlikely partners: Mickey Rady, a rogue undercover cop and Kook Packard, a smooth and charismatic con man. Together they rip off those operating outside of the law...for their own personal gain. But things go awry when one heist suck them deep into a city-wide conspiracy...\",\n" +
            "      \"release_date\": \"2018-01-02\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 5,\n" +
            "      \"id\": 479363,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 5,\n" +
            "      \"title\": \"Kamen Rider Heisei Generations FINAL: Build & Ex-Aid with Legend Riders\",\n" +
            "      \"popularity\": 100.840703,\n" +
            "      \"poster_path\": \"\\/cGhdduplj8YdAwg7iPCeGjO1YvZ.jpg\",\n" +
            "      \"original_language\": \"ja\",\n" +
            "      \"original_title\": \"仮面ライダー平成ジェネレーションズFINAL ビルド＆エグゼイドwithレジェンドライダー\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        878\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/aVnvDWF7dELkSzYJfzK9yrpvbv9.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Kamen Riders Build and Ex-Aid team up with the legendary heroes of the Heisei Generation - OOO, Fourze, Gaim, and Ghost.\",\n" +
            "      \"release_date\": \"2017-12-09\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 6865,\n" +
            "      \"id\": 76338,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6.7,\n" +
            "      \"title\": \"Thor: The Dark World\",\n" +
            "      \"popularity\": 86.00851,\n" +
            "      \"poster_path\": \"\\/bnX5PqAdQZRXSw3aX3DutDcdso5.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Thor: The Dark World\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        14\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/3FweBee0xZoY77uO1bhUOlQorNH.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Thor fights to restore order across the cosmos… but an ancient race led by the vengeful Malekith returns to plunge the universe back into darkness. Faced with an enemy that even Odin and Asgard cannot withstand, Thor must embark on his most perilous and personal journey yet, one that will reunite him with Jane Foster and force him to sacrifice everything to save us all.\",\n" +
            "      \"release_date\": \"2013-10-29\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"vote_count\": 8941,\n" +
            "      \"id\": 10195,\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6.6,\n" +
            "      \"title\": \"Thor\",\n" +
            "      \"popularity\": 85.061808,\n" +
            "      \"poster_path\": \"\\/bIuOWTtyFPjsFDevqvF3QrD1aun.jpg\",\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Thor\",\n" +
            "      \"genre_ids\": [\n" +
            "        12,\n" +
            "        14,\n" +
            "        28\n" +
            "      ],\n" +
            "      \"backdrop_path\": \"\\/LvmmDZxkTDqp0DX7mUo621ahdX.jpg\",\n" +
            "      \"adult\": false,\n" +
            "      \"overview\": \"Against his father Odin's will, The Mighty Thor - a powerful but arrogant warrior god - recklessly reignites an ancient war. Thor is cast down to Earth and forced to live among humans as punishment. Once here, Thor learns what it takes to be a true hero when the most dangerous villain of his world sends the darkest forces of Asgard to invade Earth.\",\n" +
            "      \"release_date\": \"2011-04-21\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    @Test
    public void getMovies() {
        List<PopularMovie> movies = NetworkUtils.getMovies(jsonString);
        Assert.assertFalse(movies.isEmpty());
    }
}