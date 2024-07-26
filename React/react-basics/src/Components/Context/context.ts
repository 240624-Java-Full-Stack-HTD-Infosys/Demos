import { createContext } from "react";
import { User } from "./ContextExample";

export const DashboardContext = createContext<User | undefined>(undefined);