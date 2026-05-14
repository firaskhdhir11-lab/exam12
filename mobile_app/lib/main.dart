import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

void main() => runApp(MaterialApp(home: CategoryList()));

class CategoryList extends StatefulWidget {
  @override
  _CategoryListState createState() => _CategoryListState();
}

class _CategoryListState extends State<CategoryList> {
  Future<List> fetchCategories() async {
    final response = await http.get(Uri.parse('http://localhost:8090/api/produits'));
    return json.decode(response.body);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("E-Commerce Mini")),
      body: FutureBuilder<List>(
        future: fetchCategories(),
        builder: (context, snapshot) {
          if (!snapshot.hasData) return CircularProgressIndicator();
          return ListView.builder(
            itemCount: snapshot.data!.length,
            itemBuilder: (context, i) => ListTile(title: Text(snapshot.data![i]['nom'])),
          );
        },
      ),
    );
  }
}
