import 'package:flutter/material.dart';

void main() => runApp(new MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    Widget titleSection = Container(
      padding: const EdgeInsets.all(32.0),
      child: Row(children: [
        Expanded(
            child:
                Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
          Container(
            padding: EdgeInsets.only(bottom: 8.0),
            child: Text('Sample Location Name',
                style: TextStyle(fontWeight: FontWeight.bold)),
          ),
          Text('Sample Underlying Text',
              style: TextStyle(color: Colors.grey[500]))
        ])),
        Icon(Icons.star, color: Colors.red[500]),
        Text('41')
      ]),
    );

    Column buildButtonColumn(IconData iconMeta, String label) {
      Color color = Theme.of(context).primaryColor;
      return Column(
        mainAxisSize: MainAxisSize.min,
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Icon(iconMeta, color: color),
          Container(
              margin: EdgeInsets.only(top: 8.0),
              child: Text(
                label,
                style: TextStyle(
                    fontSize: 12.0, fontWeight: FontWeight.w400, color: color),
              ))
        ],
      );
    }

    Widget buttonSection = Container(
      child: Row(mainAxisAlignment: MainAxisAlignment.spaceEvenly, children: [
        buildButtonColumn(Icons.call, 'CALL'),
        buildButtonColumn(Icons.near_me, 'ROUTE'),
        buildButtonColumn(Icons.share, 'SHARE')
      ]),
    );

    Widget textSection = Container(
      padding: EdgeInsets.all(32.0),
      child: Text(
          'Lake Oeschinen lies at the foot of the Blüemlisalp in the Bernese Alps. Situated 1,578 meters above sea level, it is one of the larger Alpine Lakes. A gondola ride from Kandersteg, followed by a half-hour walk through pastures and pine forest, leads you to the lake, which warms to 20 degrees Celsius in the summer. Activities enjoyed here include rowing, and riding the summer toboggan run.',
          softWrap: true),
    );

    return MaterialApp(
        title: 'Custom_layout_flutter',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        home: Scaffold(
            appBar: AppBar(
              title: Text('Demo_Layout'),
            ),
            body: ListView(
                children: [titleSection, buttonSection, textSection])));
  }
}
