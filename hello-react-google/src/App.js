import React, {Component} from 'react';
import './App.less';
import KeyWord from "./KeyWord";

class App extends Component {
  constructor(props, context) {
    super(props, context);
    this.state = {
      employees: []
    };
    this.render = this.render.bind(this);
  }

  componentDidMount() {
    fetch('http://localhost:5000/employees')
      .then(response => response.json())
      .then(data => {
        this.setState({
          employees: data
        });
        this.render();
      });
  }

  render() {
    return (
      <div className='App'>
        <div>
          {this.state.employees.map((item, index) => {
            return (<p key={`This is all goods---${index}`}>{item.name}</p>);
          })}
        </div>
        <KeyWord/>
      </div>
    );
  }
}

export default App;
