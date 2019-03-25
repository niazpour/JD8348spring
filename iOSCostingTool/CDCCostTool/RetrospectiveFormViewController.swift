//
//  RetrospectiveFormViewController.swift
//  CDCCostTool
//
 
import UIKit

class RetrospectFormViewController: ViewController, UIPickerViewDelegate, UIPickerViewDataSource {
    
    var rootVC: UIViewController?
    
    
    @IBOutlet weak var totalHours: UITextField!
    
    
    @IBOutlet weak var confidencePicker: UIPickerView!
    @IBOutlet weak var taskPicker: UIPickerView!
    
    var taskData: [String] = [String]()
    var confidenceData: [String] = [String] ()
    
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        //<#code#>
        return 1;
    }
    
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        // <#code#>
        if (pickerView == taskPicker) {
            return taskData.count
        } else if (pickerView == confidencePicker) {
            return confidenceData.count
        }
        return 1;
    }
    // The data to return fopr the row and component (column) that's being passed in
    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int)  -> String? {
        if (pickerView == taskPicker) {
            return taskData[row]
        } else if (pickerView == confidencePicker) {
            return confidenceData[row]
        }
        return "";
    }
    
    //Properties
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        self.taskPicker.delegate = self
        self.taskPicker.dataSource = self
        self.confidencePicker.delegate = self
        self.confidencePicker.dataSource = self
        // Input the data into the array
        taskData = ["Task 1", "Task 2", "Task 3", "Task 4", "Task 5", "Task 6"]
        confidenceData = ["100", "75", "50", "25", "0"];
    }
    
    @IBAction func onClick(_ sender: Any) {
        rootVC = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "MainNavigation") as! MainNavigationController
        
        
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        appDelegate.window?.rootViewController = rootVC
    }
}
