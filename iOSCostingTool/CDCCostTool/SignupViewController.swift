//
//  SignupViewController.swift
//  CDCCostTool
// 
//

import UIKit

class SignupViewController: UIViewController,UIPickerViewDelegate, UIPickerViewDataSource {
    
    @IBOutlet weak var agency: UITextField!
    @IBOutlet weak var rolePicker: UIPickerView!
    @IBOutlet weak var leadContact: UISwitch!
    var row = 0;
    
    var pickerData: [String] = [String]()
    let signupData = SignUpData()
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        //<#code#>
        return 1;
    }
    
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
       // <#code#>
        return pickerData.count;
    }
    // The data to return fopr the row and component (column) that's being passed in
    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int)  -> String? {
        return pickerData[row]
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        self.rolePicker.delegate = self
        self.rolePicker.dataSource = self
        // Input the data into the array
        pickerData = ["Epidemiology"]
    }
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if let viewController2 = segue.destination as? SignupForm2ViewController {
            row = rolePicker.selectedRow(inComponent: 0);
            print(row);
            signupData.role = pickerData[row];
            signupData.isLeadContact = leadContact.isOn;
            viewController2.signupData = signupData;
        }
    }
    
}

