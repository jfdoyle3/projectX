import React, { Component } from "react";
import "./App.css";
import "./materialize.css";
import CurrencyInfoComponent from "./Components/CurrencyInfoComponent";
import CurrencyHeaderComponent from "./Components/CurrencyHeaderComponent";

class App extends Component {
  render() {
    return (
      <div className="App">
        {/* <CurrencyHeaderComponent /> */}
        <CurrencyInfoComponent />
      </div>
    );
  }
}

export default App;
