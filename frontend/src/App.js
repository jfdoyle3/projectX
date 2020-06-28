import React, { Component } from "react";
import "./App.css";
import "./materialize.css";
//import CurrencyInfoComponent from "./Components/CurrencyInfoComponent";
//import CurrencyHeaderComponent from "./Components/CurrencyHeaderComponent";
import LoginComponent from "./Components/LoginComponent";

class App extends Component {
  render() {
    return (
      <div className="App">
        {/* <CurrencyHeaderComponent /> */}
        <LoginComponent />
        {/* <CurrencyInfoComponent /> */}
      </div>
    );
  }
}

export default App;
