

CREATE DATABASE `NewsAutomation` /*!40100 DEFAULT CHARACTER SET latin1 */;

CREATE TABLE `News` (
  `EventID` int(11) NOT NULL AUTO_INCREMENT,
  `EventName` varchar(100) DEFAULT NULL,
  `PGRaceURL` varchar(100) DEFAULT NULL,
  `RaceIntro` varchar(500) DEFAULT NULL,
  `RaceDate` date DEFAULT NULL,
  `Sponsor1` varchar(100) DEFAULT NULL,
  `Sponsor2` varchar(100) DEFAULT NULL,
  `State` varchar(100) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `Season` varchar(50) DEFAULT NULL,
  `ResultsURL` varchar(100) DEFAULT NULL,
  `Race_Page_URL` varchar(100) DEFAULT NULL,
  `WebsiteURL` varchar(100) DEFAULT NULL,
  `Purse` decimal(10,4) DEFAULT NULL,
  `Course1` varchar(100) DEFAULT NULL,
  `Course1AgeGroups` varchar(100) DEFAULT NULL,
  `Course1CraftTypes` varchar(100) DEFAULT NULL,
  `Course2` varchar(100) DEFAULT NULL,
  `Event` int(11) DEFAULT NULL,
  `Wind` varchar(50) DEFAULT NULL,
  `Sky` varchar(50) DEFAULT NULL,
  `Temp` int(11) DEFAULT NULL,
  `Surf` varchar(50) DEFAULT NULL,
  `Participant` int(11) DEFAULT NULL,
  `OverallMaleCourse1` varchar(100) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `OverallMaleCourse1Time` time DEFAULT NULL,
  `OverallMaleCourse1Craft` varchar(50) DEFAULT NULL,
  `2ndOverallMaleCourse1Craft` varchar(50) DEFAULT NULL,
  `2ndOverallMaleCourse1` varchar(100) DEFAULT NULL,
  `2ndOverallMaleCourse1Time` time DEFAULT NULL,
  `3rdOverallMaleCourse1` varchar(100) DEFAULT NULL,
  `OverallFemaleCourse1` varchar(100) DEFAULT NULL,
  `OverallFemaleCourse1Time` time DEFAULT NULL,
  `OverallFemaleCourse1Craft` varchar(50) DEFAULT NULL,
  `2ndOverallFemaleCourse1` varchar(100) DEFAULT NULL,
  `2ndOverallFemaleCourse1Craft` varchar(50) DEFAULT NULL,
  `3rdOverallFemaleCourse1` varchar(50) DEFAULT NULL,
  `3rdOverallFemaleCourse1Craft` varchar(50) DEFAULT NULL,
  `4thOverallFemaleCourse1` varchar(100) DEFAULT NULL,
  `PhotographerName` varchar(100) DEFAULT NULL,
  `PhotoURL` varchar(100) DEFAULT NULL,
  `ReplayURL` varchar(100) DEFAULT NULL,
  `StreamURL` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`EventID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;






INSERT INTO `NewsAutomation`.`News`
(`EventID`,
`EventName`,
`PGRaceURL`,
`RaceIntro`,
`RaceDate`,
`Sponsor1`,
`Sponsor2`,
`State`,
`City`,
`Season`,
`ResultsURL`,
`Race_Page_URL`,
`WebsiteURL`,
`Purse`,
`Course1`,
`Course1AgeGroups`,
`Course1CraftTypes`,
`Course2`,
`Event`,
`Wind`,
`Sky`,
`Temp`,
`Surf`,
`Participant`,
`OverallMaleCourse1`,
`Gender`,
`OverallMaleCourse1Time`,
`OverallMaleCourse1Craft`,
`2ndOverallMaleCourse1Craft`,
`2ndOverallMaleCourse1`,
`2ndOverallMaleCourse1Time`,
`3rdOverallMaleCourse1`,
`OverallFemaleCourse1`,
`OverallFemaleCourse1Time`,
`OverallFemaleCourse1Craft`,
`2ndOverallFemaleCourse1`,
`2ndOverallFemaleCourse1Craft`,
`3rdOverallFemaleCourse1`,
`3rdOverallFemaleCourse1Craft`,
`4thOverallFemaleCourse1`,
`PhotographerName`,
`PhotoURL`,
`ReplayURL`,
`StreamURL`)
VALUES
(<{EventID: }>,
<{EventName: }>,
<{PGRaceURL: }>,
<{RaceIntro: }>,
<{RaceDate: }>,
<{Sponsor1: }>,
<{Sponsor2: }>,
<{State: }>,
<{City: }>,
<{Season: }>,
<{ResultsURL: }>,
<{Race_Page_URL: }>,
<{WebsiteURL: }>,
<{Purse: }>,
<{Course1: }>,
<{Course1AgeGroups: }>,
<{Course1CraftTypes: }>,
<{Course2: }>,
<{Event: }>,
<{Wind: }>,
<{Sky: }>,
<{Temp: }>,
<{Surf: }>,
<{Participant: }>,
<{OverallMaleCourse1: }>,
<{Gender: }>,
<{OverallMaleCourse1Time: }>,
<{OverallMaleCourse1Craft: }>,
<{2ndOverallMaleCourse1Craft: }>,
<{2ndOverallMaleCourse1: }>,
<{2ndOverallMaleCourse1Time: }>,
<{3rdOverallMaleCourse1: }>,
<{OverallFemaleCourse1: }>,
<{OverallFemaleCourse1Time: }>,
<{OverallFemaleCourse1Craft: }>,
<{2ndOverallFemaleCourse1: }>,
<{2ndOverallFemaleCourse1Craft: }>,
<{3rdOverallFemaleCourse1: }>,
<{3rdOverallFemaleCourse1Craft: }>,
<{4thOverallFemaleCourse1: }>,
<{PhotographerName: }>,
<{PhotoURL: }>,
<{ReplayURL: }>,
<{StreamURL: }>);


