

//withoutHeader.mapPartitions(lines => {
//  val parser = new CSVParser(',')
//    lines.map(line => {
//      parser.parseLine(line).mkString(",")
//    })
//  }).take(5).foreach(println)


presWithoutHeader.mapPartitions(lines => {
    val parser = new CSVParser(',')
    lines.map(line => {
        (parser.parseLine(line), parser.parseLine(line).mkString("|"))
      })
    }).filter(_._1.map(_.trim contains "Simeticone") contains true)
      .take(5).foreach(println)
