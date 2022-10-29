package com.example.data

import com.example.models.Hero
import com.example.models.MilitaryRank
import com.example.models.Species

val heroesList = listOf(
    Hero(
        id = 1,
        name = "Roy Mustang",
        image = "/images/roy.jpg",
        memorableQuotes = listOf(
            "If you believe the possibility exists, then you should do whatever it takes.",
            "When I, who am called a 'weapon' or a 'monster', fight a real monster, I can fully realize I'm just a human.",
            "What's it like having the fluids inside of your eyes boil? I'd imagine it might sting a little."
        ),
        alias = "Flame Alchemist",
        rating = 10.00,
        about = "Roy Mustang (ロイ・マスタング Roi Masutangu), also known as the Flame Alchemist (焔の錬金術師 Honō no Renkinjutsushi), is the tritagonist of the Fullmetal Alchemist series. He is a State Alchemist and officer in the Amestrian State Military. A hero of the Ishval Civil War and Edward Elric’s superior officer, Colonel Mustang is a remarkably capable commander who plans to become the next Führer of Amestris.",
        species = Species.Human,
        militaryRank = MilitaryRank.Colonel(),
        abilities = listOf(
            "Flame-Based Alchemy"
        ),
        weapons = listOf(
            "Ignition Cloth Gloves"
        )
    ),
    Hero(
        id = 2,
        name = "Edward Elric",
        image = "/images/edward.jpg",
        memorableQuotes = listOf(
            "Like I always say, if you can't find a door... make your own!",
            "Who are you calling a shrimpy, flea-sized paramecium?!",
            "This is my last transmutation. Just sit back and enjoy the show!"
        ),
        alias = "Fullmetal Alchemist",
        rating = 9.80,
        about = "Edward Elric (エドワード・エルリック Edowādo Erurikku) also known as Ed or the Fullmetal Alchemist (鋼の錬金術師, Hagane no Renkinjutsushi), is the titular main protagonist of the Fullmetal Alchemist series.\n" +
        "After losing his right arm and left leg due to a failed Human Transmutation attempt, Ed became the youngest State Alchemist in history by achieving his certification at age twelve. Three years later, Ed has become fully engrossed in his search for the legendary Philosopher's Stone, an item with which he hopes to restore his younger brother Alphonse Elric, whose whole body had been lost in the aftermath of the human transmutation.",
        species = Species.Human,
        militaryRank = MilitaryRank.Major(),
        abilities = listOf(
            "Alchemy",
            "Staff",
            "Lance",
            "Automail arm"
        ),
        weapons = listOf(
            "Alchemy",
            "High intelligence"
        )
    ),
    Hero(
        id = 3,
        name = "Ling Yao",
        image = "/images/ling.jpg",
        memorableQuotes = listOf(
            "Friends are connected by heart! You can't just rinse off something that's stained on your soul!",
            "The king exists for his people. Without his people, there is no king.",
            "If you turn your back on something you wanted, you don't deserve to call yourself greed!"
        ),
        alias = "Prince Ling",
        rating = 9.60,
        about = "Ling Yao (リン・ヤオ, Rin Yao), also spelled as Lin Yao, is the twelfth crown prince of the eastern nation of Xing and the liege of the Yao clan. Seeking a way to ensure his path to the throne amidst deadly inter-house competition, Ling has ventured from Xing to Amestris in order to divine the secret of immortality - the Philosopher's Stone.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Dao",
            "Grenades",
            "Flash Bangs",
            "Claws"
        ),
        weapons = listOf(
            "Martial arts",
            "Sensing the aura of humans and Homunculi"
        )
    ),
    Hero(
        id = 4,
        name = "Riza Hawkeye",
        image = "/images/riza.jpg",
        memorableQuotes = listOf(
            "When will he learn. Its bad enough he is useless on rainy days.",
            "The heroes during times of war are nothing but mass murderers during times of peace.",
            "If the ways of this world are based on equivalent exchange, as alchemy says, then in order to allow for a new generation to enjoy good fortune, the price that we must pay, is to carry the bodies of the dead across a river of blood."
        ),
        alias = "The Hawk's Eye",
        rating = 9.40,
        about = "Lieutenant Riza Hawkeye (リザ・ホークアイ, Riza Hōkuai) is an officer in the Amestrian State Military as well as the personal adjutant and bodyguard of Colonel Roy Mustang. A sharpshooter and firearms specialist, Lt. Hawkeye is an invaluable asset to the Colonel both in office and on the battlefield and serves as his closest and most supportive subordinate.",
        species = Species.Human,
        militaryRank = MilitaryRank.FirstLieutenant(),
        abilities = listOf(
            "Sniping",
            "Close range gunfighting",
            "Archery"
        ),
        weapons = listOf(
            "9mm handgun",
            "Desert Eagle",
            "Revolver and Bolt Action Rifle"
        )
    ),
    Hero(
        id = 5,
        name = "Alphonse Elric",
        image = "/images/al.jpg",
        memorableQuotes = listOf(
            "I can't feel the rain hitting my face. That's something I miss...all the time. I wanna get my body back soon, Brother. I just wanna be human again. Even if it means going against the flow of the world, and trying to do the impossible.",
            "You've got lots of energy for someone who's not feeling well.",
            "We came to you because we’re trying to find a way to get our original bodies back."
        ),
        alias = "Armored Alchemist",
        rating = 9.20,
        about = "Alphonse Elric (アルフォンス・エルリック Arufonsu Erurikku), also known as Al, is the deuteragonist of the Fullmetal Alchemist series. He is the younger brother of the Fullmetal Alchemist Edward Elric. Al is also a victim of the failed Human Transmutation experiment in which Ed lost his right arm and left leg. Having had his entire physical being taken away from him in the aftermath of the tragedy, Alphonse exists solely as a soul alchemically bound to a large suit of steel armor. Now, Al travels with his brother in search of a legendary Philosopher's Stone, an item with the power to restore their bodies to normal.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Alchemy,",
            "Martial Arts,",
            "High intelligence,",
            "Highly resilient armor body"
        ),
        weapons = listOf(
            "Fists",
            "Alchemy"
        )
    ),
    Hero(
        id = 6,
        name = "Scar",
        image = "/images/scar.jpg",
        memorableQuotes = listOf(
            "I am the ooze born from the gaping wound that was Ishbal. I neither pray to God nor appeal to him. Ooze deserves no forgiveness. And I will burn until I’m left dead in a ditch like the scum that I am.",
            "Foolish alchemists who have turned their backs on the ways of God shall all be punished.",
            "God. Hear me. Two human souls have just been returned to you. Please accept them into your loving arms. Please grant these poor lost souls everlasting peace and salvation."
        ),
        alias = "The Scarred Man",
        rating = 9.00,
        about = "The Scarred Man (傷の男, Kizu no Otoko), known more casually as \"Scar\" (スカー, Sukā), is a nameless lone serial killer and vigilante who targets State Alchemists for his own brand of lethal justice in accordance with the fundamental tenets of his religion and for the revenge of his slaughtered people and family. An Ishvalan survivor of the Ishvalan Civil War, Scar's moniker comes from the large X-shaped scar on his forehead and sports a conspicuous and intricate alchemical tattoo on his right arm, which originally belonged to his older brother, and which he uses as his murder weapon of choice.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Alchemy",
            "Hand-to-hand Combat"
        ),
        weapons = listOf(
            "Anything that can be wielded as a weapon",
            "Anything that can be transmuted into a weapon",
            "Alchemic Arms"
        )
    ),
    Hero(
        id = 7,
        name = "Izumi Curtis",
        image = "/images/izumi.jpg",
        memorableQuotes = listOf(
            "When you live, your life will end sooner or later. The body will return to the earth. Grass and flowers will grow on top of it. The soul will nourish the hearts… and it will live on in the hearts of other people.",
            "Believe in yourselves and choose life over death. Otherwise, you’ve led a shameful existence.",
            "All is one, one is all."
        ),
        alias = "Teacher",
        rating = 8.80,
        about = "Izumi Curtis (イズミ・カーティス, Izumi Kātisu, née Harnet) is a master alchemist and skilled martial artist living in the southern Amestrian town of Dublith, where she runs a butcher shop with her husband Sig. Though usually doesn't take on students, she accepted Edward and Alphonse Elric's plea to taking them on as her apprentices and instructed them in both alchemical theory and martial arts for six months. Eventually, Izumi grew to love them as deeply as she would her own children, becoming a long-term source of guidance and support for the Elrics' future endeavor.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Alchemy",
            "Martial Arts"
        ),
        weapons = listOf(
            "Fists",
            "Alchemy"
        )
    ),
    Hero(
        id = 8,
        name = "Maes Hughes",
        image = "/images/hughes.jpg",
        memorableQuotes = listOf(
            "Oh, wow, it's an honor to finally meet the youngest State Alchemist ever! You're a real legend around here! I'm Lieutenant Colonel Maes Hughes, a pleasure!",
            "Major, you watch yourself. For all we know, you could be the next one he comes after.",
            "I don't get it. He hung up on me, just like that."
        ),
        alias = "",
        rating = 8.60,
        about = "Maes Hughes was an Amestrian State Military officer stationed in the Investigations Office in Central City and Colonel Roy Mustang's best friend, as well as the closest supporter of Mustang's secret bid for the position of Führer. A devoted family man and exemplary soldier, Hughes was generally well-liked by the other characters (unless he was pushing his love of his wife or daughter on them) and his murder served as the major starting point for the story to unfold. After his death, Hughes was promoted two ranks, making him Brigadier General.",
        species = Species.Human,
        militaryRank = MilitaryRank.LieutenantColonel(),
        abilities = listOf(
            "Push knives",
            "Deduction"
        ),
        weapons = listOf(
            "Push knives"
        )
    ),
    Hero(
        id = 9,
        name = "Greed",
        image = "/images/greed.png",
        memorableQuotes = listOf(
            "The name's Greed. I wanna be your friend.",
            "People like to talk in the shadow world, and I've got plenty of friends. Heh... Well... let's skip the casual chit-chat. I'm more intrested in hearing what it's like to have a body that'll never die. An individual soul transmuted--and bound to an object? Sounds like that's the perfect recipe for immortality to me. Let me explain... See, I'm Greed, I want everything you can think of. Money, women, power and sex. Status, glory. I demand the finer things. And of course, I crave eternal life.",
            "You know, it's must really like her to let your desperate fears to be used like that!"
        ),
        alias = "Greed the Avaricious",
        rating = 8.40,
        about = "Greed (グリード, Gurīdo) is the embodiment of some of Father's greed. He is called the \"Ultimate Shield\" because he can rearrange the carbon in his body to make his skin as hard as diamond, thus making him impenetrable by most weapons. As his name implies, he is a very avaricious character, who likes living in luxury, surrounded by powerful minions and beautiful women. He also has a habit of flipping people off in the manga. Despite his generally greedy nature, he is shown to care for his subordinates, as detailed below.",
        species = Species.Homunculus,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Alter the outer layer of his body to shield"
        ),
        weapons = listOf(
            "Philosopher's Stone body core",
            "Anything that can be wielded as a weapon",
            "Razor-sharp finger nails"
        )
    ),
    Hero(
        id = 10,
        name = "Alex Louis Armstrong",
        image = "/images/alex_armstrong.jpg",
        memorableQuotes = listOf(
            "You need the example of a perfect physical specimen to inspire your recovery! You see?! You're looking livelier already!",
            "State Alchemists are given high pay and special privilege. It must be any number of people who envy them for their positions. Or perhaps, they feel they have not upheld their creed, Alchemists be thou for the people. Alchemists that were supposed to be pillars of science and truth are turned into the military's walking weapons as soon as they receive certification. There are plenty of people I'm sure who have not forgotten the role that State Alchemists played in the Ishvalan Civil War.",
            "The art of portraiture has been passed down through the Armstrong family for generations."
        ),
        alias = "Strong Arm Alchemist",
        rating = 8.20,
        about = "Major Alex Louis Armstrong (アレックス・ルイ・アームストロング, Arekkusu Rui Āmusutorongu), also known as the Strong Arm Alchemist (豪腕の錬金術師, Gōwan no Renkinjutsushi), is a State Alchemist and officer in the Amestrian State Military. The scion of the illustrious Armstrong family, Alex is a remarkably caring commander and friend as well as an invaluably skilled ally to Colonel Roy Mustang and Edward Elric.",
        species = Species.Human,
        militaryRank = MilitaryRank.Major(),
        abilities = listOf(
            "Alchemy",
            "Boxing",
            "Wrestling",
            "Super Strength",
            "Portraiture",
            "Tracking"
        ),
        weapons = listOf(
            "Steel Gauntlet with Array",
            "Bare Fists"
        )
    ),
    Hero(
        id = 11,
        name = "King Bradley",
        image = "/images/bradley.jpg",
        memorableQuotes = listOf(
            "I may not have the protection of your Ultimate Shield, but I clearly see your weakness with my Ultimate Eye. Now then, Greed. How many times do I have to kill you before you stay dead?",
            "There's no such thing as a true king!",
            "Selim will never work as a point of weakness in my life. But you, on the other hand... I know exactly who to use as your weak point."
        ),
        alias = "Wrath the Furious",
        rating = 8.00,
        about = "King Bradley (キング・ブラッドレイ Kingu Buraddorei?) is one of the primary antagonists in the Fullmetal Alchemist series, being that he is one of the seven Homunculi. Bradley was also the original Führer (大総統 Daisōtō) of Amestris. In the manga series and the 2009 anime reboot, he was known as Wrath (ラース Rāsu), the final homunculus created by Father, but was changed in the 2003 anime to Pride (プライド Puraido?), created by the ancient alchemist Dante. In both series, Bradley is the leader of Amestris and is seen to have almost inhuman swordsmanship. However, in the manga and 2009 anime series, he is an important character being that Amestris was created for the sole purpose of exacting Father's plan to become the ultimate being. As Führer, Bradley is the respected Commander-in-Chief of the State Military, even though his political standpoints are often questioned in certain instances such as the Ishval Civil War, which was only one of many insurrections focused on creating a massive Philosopher's Stone for Father.",
        species = Species.Homunculus,
        militaryRank = MilitaryRank.FuhrerPresident(),
        abilities = listOf(
            "Ultimate Eye",
            "Swordsmanship",
            "Martial arts",
            "Firearms"
        ),
        weapons = listOf(
            "Swords",
            "Knives",
            "Hand grenade"
        )
    ),
    Hero(
        id = 12,
        name = "Olivier Mira Armstrong",
        image = "/images/olivier.jpg",
        memorableQuotes = listOf(
            "I don't care about letters. The ideas and opinions of others don't affect me. I decide with my own eyes. Enter, Fullmetal Alchemist. I'll warn you, I don't play around. This is the mountain fortress of Briggs. Only the strong survive here.",
            "I need you much more than a native Amestris who was born and raised in one environment. So shut up and follow orders.",
            "Folks like you, who watch the battlefield from the comfort of a safety zone, make pain out to be something lofty, and exploit it."
        ),
        alias = "Ice Queen",
        rating = 7.80,
        about = "Olivier Mira Armstrong (オリヴィエ・ミラ・アームストロング, Orivie Mira Āmusutorongu), also known as Major General Armstrong, is the primary heir to the illustrious Armstrong family, the commanding officer charged with the protection of Amestris' northern border at Fort Briggs and the older sister of Alex Louis Armstrong.",
        species = Species.Human,
        militaryRank = MilitaryRank.MajorGeneral(),
        abilities = listOf(
            "Swordsmanship",
            "Leadership",
            "Wrestling",
            "Super Strength"
        ),
        weapons = listOf(
            "A family heirloom sword"
        )
    ),
    Hero(
        id = 13,
        name = "Van Hohenheim",
        image = "/images/van.jpg",
        memorableQuotes = listOf(
            "It's just like a child who hides the sheets after he wets the bed. You ran away... And you know it.",
            "All is ultimately of the one, so if all is not included in the one, then all is nothing.",
            "I live as well as I do now, because of the knowledge you gave me. And, I’ve also earned the master’s respect. Thanks to you, maybe someday, I’ll even be able to get married, and have a family."
        ),
        alias = "Slave Number 23",
        rating = 7.60,
        about = "Van Hohenheim is a deceptively ancient and extremely powerful Alchemist as well as the estranged father of Edward and Alphonse Elric. Despite disappearing suddenly during their infancy, Hohenheim returns during the course of the series in order to right the wrongs of his mysterious past.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Regeneration",
            "Alchemy"
        ),
        weapons = listOf(
            "Alchemy"
        )
    ),
    Hero(
        id = 14,
        name = "Winry Rockbell",
        image = "/images/winry.jpg",
        memorableQuotes = listOf(
            "You'd be lost without me, Alchemy Freak.",
            "Apparently this guy lives deep in the mountains because he can find the highest quality ore way out here, are you absolutely sure were going in the right direction? Cause these engineers could have tricked us.",
            "I can't believe you. Just promise you won't do anything too dangerous."
        ),
        alias = "Crazy Gearhead",
        rating = 7.40,
        about = "Winry Rockbell (ウィンリィ・ロックベル, Uinrī Rokkuberu) is a main supporting character of the Fullmetal Alchemist series.\n" +
        "Winry is a training surgeon and mechanical repair specialist/enthusiast as she is the daughter of Yuriy Rockbell and Sarah Rockbell, two surgeons that worked on the Ishval Civil War and is the grand-daughter of Pinako Rockbell, a well known mechanic and surgeon in her youth. She is a girl from Resembool and the close childhood friend of Edward Elric and Alphonse Elric. Winry also supports Edward as his personal automail engineer and mechanic, making sure his prosthetic right arm and left leg are always in good working order.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Skilled Automail specialist and Mechanic",
            "Amateur Surgeon"
        ),
        weapons = listOf(
            "Wrench"
        )
    ),
    Hero(
        id = 15,
        name = "Lan Fan",
        image = "/images/lan-fan.jpg",
        memorableQuotes = listOf(
            "Sometimes someone must be left behind. For the greater good.",
            "It is our job...to protect...the Young Lord...",
            "Such a sad life. Tell me, Bradley. Was there anyone who you loved? Any friends? Your wife?"
        ),
        alias = "",
        rating = 7.20,
        about = "Lan Fan (ランファン, Ranfan) is a retainer of the Xing Empire's Yao Clan, a personal bodyguard of Prince Ling Yao and the grandchild of Ling's senior bodyguard, Fu. She is fiercely loyal to her prince; insults to his name cause her to fly into a rage (overwhelming her better judgment and dulling her usually sharp combat abilities) and she becomes flustered when unmasked in his presence.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Xingese Martial Arts",
            "Detection the chi of humans and Homunculi"
        ),
        weapons = listOf(
            "Kunai",
            "Grenades",
            "Bladed Automail Arm"
        )
    ),
    Hero(
        id = 16,
        name = "Envy",
        image = "/images/envy.jpg",
        memorableQuotes = listOf(
            "He called me a monster, i'd say that's quite rude, don't you?",
            "Quit your pathetic blubbering, you idiot! You were trying to kill one of our most important sacrifices. Do you understand me?! You could've messed up the entire plan! What would we have done then?! Huh?!",
            "After a daring escape, the fugitive is killed by Colonel Mustang, eager to avenge his best friend. And all's well that ends well."
        ),
        alias = "Envy the Jealous",
        rating = 7.00,
        about = "Envy (エンヴィー Envī) is the embodiment of some of Father's envy. Envy has the ability to shape-shift. This ability can be used to assume the form of any existing person (or original personas that Envy himself creates). He can even modify his own voice to directly copy others. Being a homunculus, Envy technically has no sex. Although he is capable of taking the form of both male and female people, he himself is referred as a male.\n" +
        "Envy, who exists only to make humans suffer, bears more bitter resentment for humans than any other homunculus, and negatively treats with humans in the most personal and heartfelt manner. His hatred for humans has an immense emotional and personal foundation greater than any of his siblings'. Envy can easily be set off by insults due to his large and delicate ego, thus causing him to make mistakes.\n" +
        "Envy is one of the two Homunculi who possesses \"true forms\"—physical incarnations of his traits and personality that take shape when his Stones are almost completely depleted. The other homunculus with a true form is Pride.",
        species = Species.Homunculus,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Shape-shifting",
            "Immortality",
            "Rapid Regeneration"
        ),
        weapons = listOf(
            "Philosopher's Stone body core"
        )
    ),
    Hero(
        id = 17,
        name = "Mei Chang",
        image = "/images/mei.jpg",
        memorableQuotes = listOf(
            "You know how you can feel a crowd’s fear before a disaster? It’s like that, but it’s far worse.",
            "My name is May Chang, sir. I was collapsed by the side of the road... Your master, Mr. Yoki, revived me and brought me back here.",
            "Are these two giving you trouble, servant? This is the servant of the man who saved my life. You better leave him alone, puny little boy!"
        ),
        alias = "Princess Chang",
        rating = 6.80,
        about = "Mei Chang (also spelled \"May\") is the seventeenth royal princess of Xing, born to the Xingese Emperor and the royal concubine representing the Chang house.\n" +
        "Despite being so young, Mei has been tasked with finding a way to raise the social standing of the poor, downtrodden Chang clan in the eyes of the Emperor and has embarked on a journey to discover and present her father with the secret to immortality. Skilled as she is in the art of Alkahestry, Mei sets out across the desert toward Amestris with her beloved pet panda, Xiao-Mei, so that she may learn about the Philosopher's Stone and, arriving there, seeks out the tutelage of the Fullmetal Alchemist.",
        species = Species.Human,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Martial Arts",
            "sensing the chi of humans and Homunculi",
            "Alkahestry"
        ),
        weapons = listOf(
            "Kunai",
            "Grenades",
            "Bladed Automail Arm"
        )
    ),
    Hero(
        id = 18,
        name = "Zolf J. Kimblee",
        image = "/images/kimblee.jpg",
        memorableQuotes = listOf(
            "It's in accordance with your ideals...in order to obtain something you give up something of equal value.",
            "You call this a tempest?! Oh stop, you're going to make me laugh! The bitterness that all these voices contain soothes me like a lullaby!",
            "was perfectly content, but when you decided to throw away you honor as a homunculus, you forced me step in. You speak of your precious pride, a quality for which you were named. But then you suddenly find yourself in grave danger, and you seek to escape into the body of a human, a lower life form that you so despise. It's pathetic. You're a disgrace!"
        ),
        alias = "Crimson Lotus Alchemist",
        rating = 6.60,
        about = "Solf J. Kimblee (ゾルフ・J・キンブリー, Zorufu J Kinburī, also spelled Zolf J. Kimbley), the Crimson Lotus Alchemist (紅蓮の錬金術師, Guren no Renkinjutsushi), sometimes referred to as the Crimson Alchemist, is a recurring antagonist in the Fullmetal Alchemist series. He is a former State Alchemist and special agent working under the direct orders of Führer King Bradley. Admittedly sadistic, Kimblee was imprisoned in Central City for several years after his official involvement in the Ishval Civil War for having infamously turned his unique brand of combustion-based combat alchemy on people who were not on his government-approved kill list. Due to conspiratorial acts at the top of government, Kimblee is officially exonerated of his crimes so as to serve as the Führer's hidden left hand in the secret battles to come.",
        species = Species.Human,
        militaryRank = MilitaryRank.Major(),
        abilities = listOf(
            "Alchemy",
            "Photographic memory",
            "Control over his regurgitation"
        ),
        weapons = listOf(
            "Alchemy"
        )
    ),
    Hero(
        id = 19,
        name = "Lust",
        image = "/images/lust.jpg",
        memorableQuotes = listOf(
            "Human foolishness never ceases to amaze me. Wouldn't you agree, Gluttony?",
            "Bloodshed gives way to more bloodshed. Hatred breeds more hatred... Until all the violence soaks into the land, carving rivers of blood. and no matter how many times it happens, they never learn. The human race is made up of violent miserable fools.",
            "In the end, burning the entire place down was easier."
        ),
        alias = "Lust the Lascivious",
        rating = 6.40,
        about = "Lust (ラスト, Rasuto) is the embodiment of Father's lust who is mildly flirtatious, but she serves mostly as an object of lust for others, feeding their desires so that she could fulfill her duties to Father. She was usually partnered with Gluttony to whom she appears to have a particular (almost motherly) closeness.",
        species = Species.Homunculus,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Claws creation",
            "Immense beauty/seduction"
        ),
        weapons = listOf(
            "Philosopher's Stone body core",
            "Claws"
        )
    ),
    Hero(
        id = 20,
        name = "Gluttony",
        image = "/images/gluttony.jpg",
        memorableQuotes = listOf(
            "Can I eat him?",
            "Are lots of people gonna die again?",
            "I smell him. I can smell him. The scar faced Ishvallan... he's close. I can taste his stink. Like blood. I still get to eat him, right?"
        ),
        alias = "Gluttony the Voracious",
        rating = 6.20,
        about = "Gluttony is the embodiment of some of Father's gluttony. Often, he will be found eating a random person or creature's remains unless ordered to eat someone that poses a threat, or to remove evidence of the Homunculi's presence. He is typically in the company of Lust.",
        species = Species.Homunculus,
        militaryRank = MilitaryRank.Civilian(),
        abilities = listOf(
            "Able to consume any known material",
            "Advanced sense of smell"
        ),
        weapons = listOf(
            "Powerful jaws"
        )
    )
)