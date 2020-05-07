import React from 'react';
import './SearchButton.less';

class SearchButton extends React.Component{
    constructor(props){
        super(props);

        this.buttonValue = {
            value: props.value
        };

        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit() {
        const employee = {
            "name": this.props.keyword
        };

        console.log(employee);
        fetch(`http://localhost:5000/employees`, {
            method: "POST",
            body: `${JSON.stringify(employee)}`,
            headers: {
                'content-type': 'application/json'
            }
        })
          .then(response => {
              if(response.status === 201){
                  location.reload();
              }else if(response.status === 409){
                  alert("已存在");
              }
          })
    }

    render() {
        return (
            <button onClick={this.handleSubmit} >{this.buttonValue.value}</button>
        );
    }
}

export default SearchButton;
